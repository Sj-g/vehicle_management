package com.it.vehicle.controller.user;

import cn.hutool.json.JSONObject;
import com.it.vehicle.dto.Coordinate;
import com.it.vehicle.dto.MapMessage;
import com.it.vehicle.dto.Message;
import com.it.vehicle.dto.StatusCode;
import com.it.vehicle.entity.Location;
import com.it.vehicle.service.LocationService;
import com.it.vehicle.utils.myHttpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MapManageController {

    private final LocationService locationService;

    @Autowired
    public MapManageController(LocationService locationService) {
        this.locationService = locationService;
    }
    /**
     * 规划界面
     *
     * @return 界面
     */
    @GetMapping("/getRoutePage")
    String getRoutePage() {
        return "view/driver/routePlaning2";
    }

    /**
     * 前端司机的实时位置，保存到数据库
     *  把司机和货车的管理信息放到session域中
     * @param coordinate 位置信息
     */
    @PostMapping("/getLocation")
    @ResponseBody
    Message addLocation(@RequestBody Coordinate coordinate, Integer truckId) {
        if (coordinate == null || truckId == null) {
            return Message.status(StatusCode.ENTITY_NULL);
        }
        Location location = new Location();
        location.setTruckLatitude(String.valueOf(coordinate.getLatitude()));
        location.setTruckLongitude(String.valueOf(coordinate.getLongitude()));
        location.setLocationTruckId(truckId);
        java.util.Date date = new java.util.Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        location.setCreateTime(timestamp);
        locationService.addLocation(location);
        return Message.success();
    }


    /**
     * 传入transportId获取规矩页面
     * 获取规划城市的路线
     * 起点是由司机的开启导航的任务决定的
     *
     * @return 规划城市的坐标
     */
    @GetMapping("/getRoute")
    @ResponseBody
    List<Coordinate> getRoute(Integer transportId) {
       return locationService.getRoute(transportId);
    }
    
}
