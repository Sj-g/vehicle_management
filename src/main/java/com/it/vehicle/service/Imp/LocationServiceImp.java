package com.it.vehicle.service.Imp;

import cn.hutool.json.JSONObject;
import com.it.vehicle.dto.AddressInfo;
import com.it.vehicle.dto.Coordinate;
import com.it.vehicle.dto.MapMessage;
import com.it.vehicle.entity.Location;
import com.it.vehicle.entity.LocationExample;
import com.it.vehicle.mapper.LocationMapper;
import com.it.vehicle.mapper.TransportMapper;
import com.it.vehicle.service.LocationService;
import com.it.vehicle.utils.myHttpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LocationServiceImp implements LocationService {
    /**
     * 高德地图请求秘钥
     */
    private static final String KEY = "726cea33b2c18932d88bf8b30e8d35ec";
    /**
     * 返回值类型
     */
    private static final String OUTPUT = "JSON";
    /**
     * 根据地名获取高德经纬度Api
     */
    private static final String GET_LNG_LAT_URL = "https://restapi.amap.com/v3/geocode/geo";
    /**
     * 根据经纬度获取详细地址
     */
    private static final String GET_ARD="https://restapi.amap.com/v3/geocode/regeo";
    private final LocationMapper locationMapper;
    private final TransportMapper transportMapper;

    @Autowired
    public LocationServiceImp(LocationMapper locationMapper, TransportMapper transportMapper) {
        this.locationMapper = locationMapper;
        this.transportMapper = transportMapper;
    }

    @Override
    public void addLocation(Location location) {
        locationMapper.insertSelective(location);
    }

    @Override
    public List<Coordinate> getRoute(Integer transportId) {
        List<Coordinate> list = new ArrayList<>();
        Map<String, Object> params = new HashMap<>();
        params.put("key", KEY);
        params.put("output", OUTPUT);
        params.put("batch", "true");
        String address=transportMapper.selectByPrimaryKey(transportId).getTransportPath();
        params.put("address", address);
//        params.put("city", "商丘市");
        //沿途经过点和终点
        JSONObject jsonObject = myHttpUtils.getResult(GET_LNG_LAT_URL, params);
        MapMessage mapMessage = jsonObject.toBean(MapMessage.class);
        for (int i = 0; i < mapMessage.getGeocodes().size(); i++) {
            String s = mapMessage.getGeocodes().get(i).getLocation();
            String[] strings = s.split(",");
            Coordinate coordinate = new Coordinate();
            coordinate.setLongitude(Double.valueOf(strings[0]));
            coordinate.setLatitude(Double.valueOf(strings[1]));
            list.add(coordinate);
        }
        return list;
    }

    @Override
    public Coordinate getTruckLocation(Integer truckId) {
        LocationExample example=new LocationExample();
        LocationExample.Criteria criteria = example.createCriteria();
        criteria.andLocationTruckIdEqualTo(truckId);
        List<Location> locations = locationMapper.selectByExample(example);
        if (locations==null || locations.size() == 0){
            return new Coordinate();
        }
        Coordinate coordinate=new Coordinate();
        coordinate.setLatitude(Double.valueOf(locations.get(0).getTruckLatitude()));
        coordinate.setLongitude(Double.valueOf(locations.get(0).getTruckLongitude()));
        Map<String, Object> params = new HashMap<>();
        params.put("key", KEY);
        params.put("location",coordinate.getLongitude()+","+coordinate.getLatitude());
        params.put("extensions","base");
        params.put("batch","false");
        params.put("roadlevel","1");
        JSONObject jsonObject = myHttpUtils.getResult(GET_ARD, params);
        AddressInfo addressInfo = jsonObject.toBean(AddressInfo.class);
        coordinate.setAddress(addressInfo.getRegeocode().getFormatted_address());
        return coordinate;
    }
}
