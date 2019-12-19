package com.it.vehicle.controller.admin;

import com.it.vehicle.dto.Coordinate;
import com.it.vehicle.dto.Message;
import com.it.vehicle.entity.Driver;
import com.it.vehicle.entity.Transport;
import com.it.vehicle.entity.Truck;
import com.it.vehicle.service.DriverService;
import com.it.vehicle.service.LocationService;
import com.it.vehicle.service.TransportService;
import com.it.vehicle.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * 后台关于地图
 * 获得目标的位置
 * 获取其路径信息
 */
@Controller
public class InOrderTrackController {
    private final LocationService locationService;
    private final TransportService transportService;
    private final DriverService driverService;
    private final TruckService truckService;

    @Autowired
    public InOrderTrackController(LocationService locationService, TransportService transportService, DriverService driverService, TruckService truckService) {
        this.locationService = locationService;
        this.transportService = transportService;
        this.driverService = driverService;
        this.truckService = truckService;
    }

    /**
     * 转发到在途跟踪
     * 获取货车信息 司机信息 运输单信息
     * @param modelAndView 模型和视图
     * @param transportId  运输单id
     * @return 模型和视图
     */
    @RequestMapping("/getInRoadTracking/{transportId}")
    public ModelAndView getInRoadTracking(ModelAndView modelAndView,@PathVariable Integer transportId) {
        Transport transport = transportService.selectTransportById(transportId);
        Truck truck = truckService.selectTruckByTransportId(transport.getTransportId());
        Integer truckDriverId = truck.getTruckDriverId();
        if (truckDriverId != null) {
            Driver driver = driverService.selectDriverById(truckDriverId);
            modelAndView.addObject("driver",driver);
        }
        Coordinate truckLocation = locationService.getTruckLocation(truck.getTruckId());
        if (truckLocation!=null){
            modelAndView.addObject("truckLocation",truckLocation);
        }
        modelAndView.addObject("transport",transport);
        modelAndView.addObject("truck",truck);
        modelAndView.setViewName("admin/track");

        return modelAndView;
    }

    /**
     * 根据运输单获取路径规划信息
     */
    @GetMapping("/getTruckRoute")
    public Message getTruckRoute(Integer transportId) {
        if (transportId == null) {
            Message.fail("运输单Id为空");
        }
        List<Coordinate> coordinateList = locationService.getRoute(transportId);
        return Message.success().add("路径规划", coordinateList);
    }

    /**
     * 管理员获取货车位置
     */
    @GetMapping("/getTruckLocation")
    public Message getTruckLocation(Integer truckId) {
        Coordinate coordinate = locationService.getTruckLocation(truckId);
        return Message.success().add("货车位置", coordinate);
    }
}
