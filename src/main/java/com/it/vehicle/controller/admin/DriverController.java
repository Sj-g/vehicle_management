package com.it.vehicle.controller.admin;

import com.it.vehicle.dto.StatusCode;
import com.it.vehicle.dto.Message;
import com.it.vehicle.entity.Driver;
import com.it.vehicle.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 司机的操作界面
 */
@RestController
@RequestMapping("/driver")
public class DriverController {
    private final DriverService driverService;

    @Autowired
    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    /**
     * 添加司机
     * @param driver 司机
     * @return 反馈信息
     */
    @GetMapping("/addDriver")
    Message addDriver(Driver driver) {
        if (driver == null) {
            return Message.status(StatusCode.ENTITY_NULL);
        }
        driverService.addDriver(driver);
        return Message.success();
    }

    /**
     * 删除
     *
     * @param driverId 司机ID
     * @return 反馈信息
     */
    @GetMapping("/deleteDriver/{driverId}")
    Message deleteDriver(@PathVariable Integer driverId) {
        if (driverId != null) {
            driverService.deleteDriver(driverId);
            return Message.success();
        }
        return Message.status(StatusCode.ENTITY_NULL);
    }

    /**
     * 批量删除
     *
     * @param driverId 司机Id
     * @return 反馈信息
     */
    @GetMapping("/batchDeleteDriver")
    Message batchDeleteDriver(@RequestParam("driverId") List<Integer> driverId) {
        if (driverId != null && driverId.size() > 0) {
            driverService.batchDeleteDriver(driverId);
            return Message.success();
        }
        return Message.status(StatusCode.ENTITY_NULL);
    }
    /**
     * 更新司机
     * @param driver 司机
     * @return 反馈信息
     */
    @PostMapping("/updateDriver")
    Message updateDriver(Driver driver) {
        if (driver != null) {
            driverService.updateDriver(driver);
            return Message.success();
        }
        return Message.status(StatusCode.ENTITY_NULL);
    }
    /**
     * 查询全部
     */
    @GetMapping("/selectDriver")
    Message selectDriver(){
        return Message.success().add("data",driverService.selectAllDriver());
    }
    /**
     * 查询单个
     */
    @GetMapping("/selectDriverById/{driverId}")
    Message selectDriverById(Integer driverId){
        return Message.success().add("data",driverService.selectDriverById(driverId));
    }
}
