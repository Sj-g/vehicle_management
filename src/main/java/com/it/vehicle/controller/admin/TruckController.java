package com.it.vehicle.controller.admin;

import com.it.vehicle.dto.StatusCode;
import com.it.vehicle.dto.Message;
import com.it.vehicle.entity.Driver;
import com.it.vehicle.entity.Truck;
import com.it.vehicle.service.DriverService;
import com.it.vehicle.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 货车的操作订单
 */
@Controller
@RequestMapping("/truck")
public class TruckController {
    private final TruckService truckService;
    private final DriverService driverService;
    @Autowired
    public TruckController(TruckService truckService, DriverService driverService) {
        this.truckService = truckService;
        this.driverService = driverService;
    }
    @RequestMapping("/getVehiclePage")
    public ModelAndView getVehiclePage(ModelAndView modelAndView){
        List<Truck> trucks = this.selectAllTruck();
        modelAndView.addObject("trucks",trucks);
        modelAndView.setViewName("admin/vehicle");
        return modelAndView;
    }
    /**
     * 增加货车
     *
     * @param truck 管理员
     * @return 反馈信息
     */
    @RequestMapping("/addTruck")
    Message addTruck(Truck truck) {
        if (truck == null) {
            return Message.status(StatusCode.ENTITY_NULL);
        }
        truckService.addTruck(truck);
        return Message.success();
    }

    /**
     * 删除货车
     *
     * @param truckId 货车Id
     * @return 用户反馈
     */
    @GetMapping("/deleteTruck/{truckId}")
    Message deleteTruck(Integer truckId) {
        if (truckId == null) {
            return Message.status(StatusCode.ENTITY_NULL);
        }
        //删除管理员
        truckService.deleteTruckById(truckId);
        return Message.success();
    }

    /**
     * 批量删除
     * @param truckIds 货车Id
     * @return 反馈信息
     */
    @GetMapping("/batchDeleteTruck")
    Message batchDeleteTruck(@RequestParam("truckId") List<Integer> truckIds) {
        if (truckIds != null && truckIds.size() > 0) {
            truckService.batchDeleteTruck(truckIds);
            return Message.success();
        }
        return Message.status(StatusCode.ENTITY_NULL);
    }

    /**
     * 更新货车
     *
     * @param truck 管理员
     * @return 反馈信息
     */
    @PostMapping("/updateTruck")
    Message updateTruck(Truck truck) {
        if (truck == null) {
            return Message.status(StatusCode.ENTITY_NULL);
        }
        //更新用户
        truckService.updateTruck(truck);
        return Message.success();
    }

    /**
     * 查询全部
     *并获取司机的信息
     * @return 管理员集合
     */
    @GetMapping("/selectAllTruck")
   List<Truck> selectAllTruck() {
        List<Truck> trucks = truckService.selectAll();
        for (Truck truck : trucks) {
            Driver driver = driverService.selectDriverById(truck.getTruckDriverId());
            if (driver!=null){
                truck.setDriver(driver);
            }
        }
        return trucks;
    }

    /**
     * 根据Id查询
     */
    @GetMapping("/queryTruck")
    Message queryTruck(Integer truckId) {
        return Message.success().add("data",truckService.selectTruckById(truckId));
    }
}