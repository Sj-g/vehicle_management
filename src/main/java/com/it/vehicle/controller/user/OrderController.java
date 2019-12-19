package com.it.vehicle.controller.user;

import com.it.vehicle.dto.Message;
import com.it.vehicle.entity.Driver;
import com.it.vehicle.entity.Transport;
import com.it.vehicle.entity.Truck;
import com.it.vehicle.service.DriverService;
import com.it.vehicle.service.TransportService;
import com.it.vehicle.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class OrderController {
    private final TransportService transportService;
    private final TruckService truckService;
    private final DriverService driverService;
    @Autowired
    public OrderController(TransportService transportService, TruckService truckService, DriverService driverService) {
        this.transportService = transportService;
        this.truckService = truckService;
        this.driverService = driverService;
    }

    /**
     * 获取运输单
     * @return 数据
     */
    @GetMapping("getTransport/{driverId}")
    public Message getTransport(@PathVariable Integer driverId){
        Transport transport=transportService.getTransport(driverId);
        return Message.success().add("transport",transport);
    }

    /**
     * 运输单详情
     * 货车 司机   路径
     * @return 数据
     */
    @GetMapping("/getTransportDetailed/{transportId}")
    public Message getTransportDetailed(@PathVariable Integer transportId){
        //订单信息
        Transport transport=transportService.getTransportById(transportId);
        //货车信息
        Truck truck=truckService.selectTruckByTransportId(transportId);
        //路径
        List<String> strings=transportService.getThePath(transportId);
        return null;
    }
}
