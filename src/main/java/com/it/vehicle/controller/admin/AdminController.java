package com.it.vehicle.controller.admin;


import com.it.vehicle.dto.StatusCode;
import com.it.vehicle.dto.Message;
import com.it.vehicle.entity.Admin;
import com.it.vehicle.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 关于的操作界面
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @RequestMapping("/src/main/test")
    String testInterceptor() {
        return "admin/success";
    }
    @RequestMapping("/test")
    String test() {
        return "admin/datatable";
    }
    /**
     * 增加管理员
     *
     * @param admin 管理员
     * @return 反馈信息
     */
    @PostMapping("/addAdmin")
    Message addAdmin(Admin admin) {
        if (admin == null) {
            return Message.status(StatusCode.ENTITY_NULL);
        }
        adminService.addAdmin(admin);
        return Message.success();
    }

    /**
     * 删除管理员
     *
     * @param adminId 管理员Id
     * @return 用户反馈
     */
    @GetMapping("/deleteAdmin")
    Message deleteAdmin(Integer adminId) {
        if (adminId == null) {
            return Message.status(StatusCode.ENTITY_NULL);
        }
        //删除管理员
        adminService.deleteAdmin(adminId);
        return Message.success();
    }

    /**
     * 批量删除
     *
     * @param adminIds 管理员Id
     * @return 反馈信息
     */
    @GetMapping("/batchDeleteAdmin")
    Message batchDeleteAdmin(List<Integer> adminIds) {
        if (adminIds != null && adminIds.size() > 0) {
            adminService.batchDeleteAdmin(adminIds);
            return Message.success();
        }
        return Message.status(StatusCode.ENTITY_NULL);
    }

    /**
     * 更新管理员
     *
     * @param admin 管理员
     * @return 反馈信息
     */
    @PostMapping("/updateAdmin")
    Message updateAdmin(Admin admin) {
        if (admin == null) {
            return Message.status(StatusCode.ENTITY_NULL);
        }
        //更新用户
        adminService.updateAdmin(admin);
        return Message.success();
    }

    /**
     * 查询按照状态
     * @return 管理员集合
     */
    @GetMapping("/getAdmin")
    @ResponseBody
    Message queryAllAdmin() {
        List<Admin> adminList = adminService.selectAdminByStatus();
        if (adminList.size()>0){
            return Message.success().add("data",adminList);
        }
        return  Message.status(StatusCode.QUERY_RESULT);

    }

    /**
     * 根据Id查询
     */
    @GetMapping("/queryAdmin/{adminId}")
    Message queryAdmin(@PathVariable Integer adminId) {
        Admin admin = adminService.selectAdminById(adminId);
        if (admin!=null){
            return Message.success().add("data",admin);
        }
        return Message.status(StatusCode.QUERY_RESULT);
    }

}
