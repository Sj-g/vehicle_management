package com.it.vehicle.controller.admin;

import com.it.vehicle.entity.Admin;
import com.it.vehicle.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:spring/spring-mybatis.xml","classpath:spring/spring-mvc.xml"})
public class AdminControllerTest {
    @Autowired
    AdminService adminService;
    @Test
    public void addAdmin() {
        Admin admin=new Admin();
        adminService.addAdmin(admin);
    }
}