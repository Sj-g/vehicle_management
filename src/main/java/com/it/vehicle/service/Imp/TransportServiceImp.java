package com.it.vehicle.service.Imp;

import cn.hutool.http.HttpException;
import cn.hutool.json.JSONException;
import cn.hutool.json.JSONObject;
import com.it.vehicle.dto.EntityStatus;
import com.it.vehicle.dto.TransportURL;
import com.it.vehicle.entity.*;
import com.it.vehicle.mapper.GoodsOrderMapper;
import com.it.vehicle.mapper.TransportMapper;
import com.it.vehicle.mapper.TruckMapper;
import com.it.vehicle.service.TransportService;
import com.it.vehicle.utils.myHttpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class TransportServiceImp implements TransportService {
    private final TransportMapper transportMapper;
    private final TruckMapper truckMapper;
    private final GoodsOrderMapper goodsOrderMapper;

    @Autowired
    public TransportServiceImp(TransportMapper transportMapper, TruckMapper truckMapper, GoodsOrderMapper goodsOrderMapper) {
        this.transportMapper = transportMapper;
        this.truckMapper = truckMapper;
        this.goodsOrderMapper = goodsOrderMapper;
    }

    /**
     * 智能调度
     * 从服务器上获取 订单 车辆 路径规划 发货地点统一是郑州
     * 总体的流程:首先我们根据订单的发货时间信息和现有的车辆空闲资源 改变订单信息有利于算法对车辆的调度和路径的规划
     * transportId  利用MyBatis的特性返回插入后的ID,返回到transport(Bean)中
     *
     * @throws HttpException 当无法访问服务器时抛出异常
     * @throws JSONException JSON的格式错误
     */
    @Override
    public void addTransport() throws HttpException, JSONException {
        //获取算法框架整理好的JSON数据，加入订单表
        String url = "http://127.0.0.1:8000/get_json/";
        JSONObject resultNoParam = myHttpUtils.getResultNoParam(url);
        Collection<Object> objects = resultNoParam.values();
        Object[] object = objects.toArray();
        for (Object json : object) {
            JSONObject jsonObject = (JSONObject) json;
            TransportURL transportURL = jsonObject.toBean(TransportURL.class);
            Transport transport = new Transport();
            String transportPath = "";
            String end = "";
            for (int j = 0; j < transportURL.getPath().size(); j++) {
                if (j == transportURL.getPath().size() - 1) {
                    transportPath = transportPath.concat(transportURL.getPath().get(j));
                    end = transportURL.getPath().get(j);
                } else {
                    transportPath = transportPath.concat(transportURL.getPath().get(j) + "|");
                }
            }

            transport.setTransportPath("郑州" + "|" + transportPath);
            transport.setTransportOrigin("郑州");
            transport.setTransportEnd(end);
            transport.setTransportState(EntityStatus.TRANSPORT_FREE.getCode());

            Truck truck = new Truck();
            truck.setTruckStatus(EntityStatus.TRUCK_STOCK.getCode());
            for (int i = 0; i < transportURL.getOrders_weight().size(); i++) {
                transport.setTransportId(null);
                transport.setTransportWeight(transportURL.getOrders_weight().get(i));
                transportMapper.insertSelective(transport);
                int transportId = transport.getTransportId();

                truck.setTruckTransportId(transportId);
                truck.setTruckId(transportURL.getTruck_number_list().get(i));
                truckMapper.updateByPrimaryKeySelective(truck);

                GoodsOrder goodsOrder = new GoodsOrder();
                goodsOrder.setOrderStatus(EntityStatus.TRUCK_STOCK.getCode());

                for (int j = 0; j < transportURL.getOrder_id_list().get(i).size(); j++) {
                    goodsOrder.setOrderId(transportURL.getOrder_id_list().get(i).get(j));
                    goodsOrder.setTransportId(transportId);
                    goodsOrderMapper.updateByPrimaryKeySelective(goodsOrder);
                }
            }
        }
    }


    @Override
    public void deleteTransport(Integer transportId) {
        transportMapper.deleteByPrimaryKey(transportId);
    }

    @Override
    public void batchDeleteTransport(List<Integer> transportIds) {
        TransportExample transportExample = new TransportExample();
        TransportExample.Criteria criteria = transportExample.createCriteria();
        criteria.andTransportIdIn(transportIds);
        transportMapper.deleteByExample(transportExample);
    }

    @Override
    public void updateTransport(Transport transport) {
        transportMapper.updateByPrimaryKeySelective(transport);
    }

    @Override
    public List<Transport> selectAllTransport() {
        TransportExample transportExample = new TransportExample();
        TransportExample.Criteria criteria = transportExample.createCriteria();
        List<Integer> list = new ArrayList<>();
        list.add(EntityStatus.TRANSPORT_EXCEPTION.getCode());
        list.add(EntityStatus.TRANSPORT_FREE.getCode());
        list.add(EntityStatus.TRANSPORT_IN_THE_TRANSPORT.getCode());
        list.add(EntityStatus.TRANSPORT_RECEIPT.getCode());
        criteria.andTransportStateIn(list);
        return transportMapper.selectByExample(transportExample);
    }

    @Override
    public Transport selectTransportById(Integer transportId) {
        Transport transport = transportMapper.selectByPrimaryKey(transportId);
        String transportPath = transport.getTransportPath();
        String[] strings = transportPath.split("\\|");
        List<String> stringList=new ArrayList<>();
        for (String string : strings) {
            stringList.add(string.trim());
        }
        transport.setTransportRoute(stringList);
        return transport;
    }

    @Override
    public Transport getTransport(Integer driverId) {
        TruckExample truckExample = new TruckExample();
        TruckExample.Criteria criteria1 = truckExample.createCriteria();
        criteria1.andTruckDriverIdEqualTo(driverId);
        List<Truck> trucks = truckMapper.selectByExample(truckExample);
        return transportMapper.selectByPrimaryKey(trucks.get(0).getTruckTransportId());
    }

    @Override
    public List<String> getThePath(Integer transportId) {
        Transport transport = transportMapper.selectByPrimaryKey(transportId);
        String transportPath = transport.getTransportPath();
        List<String> list = new ArrayList<>();
        String[] split = transportPath.split("\\|");
        for (String s : split) {
            list.add(s.trim());
        }
        return list;
    }

    @Override
    public Transport getTransportById(Integer transportId) {
        return transportMapper.selectByPrimaryKey(transportId);
    }

}
