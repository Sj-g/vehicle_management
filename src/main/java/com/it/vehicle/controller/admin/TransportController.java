package com.it.vehicle.controller.admin;

import com.it.vehicle.dto.StatusCode;
import com.it.vehicle.dto.Message;
import com.it.vehicle.entity.Driver;
import com.it.vehicle.entity.GoodsOrder;
import com.it.vehicle.entity.Transport;
import com.it.vehicle.entity.Truck;
import com.it.vehicle.service.GoodsService;
import com.it.vehicle.service.TransportService;
import com.it.vehicle.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * 运输订单操作
 */
@Controller
public class TransportController {
    private final TransportService transportService;
    private final GoodsService goodsService;
    private final TruckService truckService;
    @Autowired
    public TransportController(TransportService transportService, GoodsService goodsService, TruckService truckService) {
        this.transportService = transportService;

        this.goodsService = goodsService;
        this.truckService = truckService;
    }

    @RequestMapping("/getTransportPage")
    public ModelAndView getTransportPage(ModelAndView modelAndView) {
        List<Transport> transports = transportService.selectAllTransport();
        modelAndView.addObject("transports", transports);
        modelAndView.setViewName("admin/transportOrder");
        return modelAndView;
    }

    /**
     * 获取运输单的详情页
     *  车辆信息 订单信息 运输单信息
     * @param modelAndView 数据和视图
     * @param transportId 运输单Id
     * @return 数据和视图
     */
    @RequestMapping("/getTransportDetailsPage/{transportId}")
    public ModelAndView getTransportDetailsPage(ModelAndView modelAndView, @PathVariable Integer transportId) {
        Truck truck = truckService.selectTruckByTransportId(transportId);
        List<GoodsOrder> goodsOrderList = goodsService.selectGoodsOrderByTransportId(transportId);
        Transport transport=transportService.selectTransportById(transportId);
        modelAndView.addObject("truck",truck);
        modelAndView.addObject("goodsOrderList",goodsOrderList);
        modelAndView.addObject("transport",transport);
        modelAndView.setViewName("admin/orderDetailsPage");
        return modelAndView;
    }

    /**
     * 删除运输订单
     *
     * @param transportId 运输订单Id
     * @return 用户反馈
     */
    @GetMapping("/deleteTransport/{transportId}")
    Message deleteTransport(@PathVariable Integer transportId) {
        if (transportId == null) {
            return Message.status(StatusCode.ENTITY_NULL);
        }
        //删除运输订单
        transportService.deleteTransport(transportId);
        return Message.success();
    }

    /**
     * 批量删除
     *
     * @param transportIds 运输订单Id
     * @return 反馈信息
     */
    @PostMapping("/batchDeleteTransport")
    Message batchDeleteTransport(@RequestParam("transportId") List<Integer> transportIds) {
        if (transportIds != null && transportIds.size() > 0) {
            transportService.batchDeleteTransport(transportIds);
            return Message.success();
        }
        return Message.status(StatusCode.ENTITY_NULL);
    }

    /**
     * 更新运输订单
     *
     * @param transport 运输订单
     * @return 反馈信息
     */
    @PostMapping("/updateTransport")
    Message updateTransport(Transport transport) {
        if (transport == null) {
            return Message.status(StatusCode.ENTITY_NULL);
        }
        //更新运输订单
        transportService.updateTransport(transport);
        return Message.success();
    }

    /**
     * 查询全部
     *
     * @return 运输订单集合
     */
    @GetMapping("/selectAllTransport")
    List<Transport> selectAllTransport() {
        return transportService.selectAllTransport();
    }

    /**
     * 根据Id查询
     *
     * @param transportId 运输单Id
     * @return 运输单
     */
    @GetMapping("/queryTransport/{transportId}")
    Message queryTransport(Integer transportId) {
        return Message.success().add("data", transportService.selectTransportById(transportId));
    }

}
