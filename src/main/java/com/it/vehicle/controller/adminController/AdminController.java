package com.it.vehicle.controller.adminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/test")
    public String testInterceptor(){
        return "admin/success";
    }
}
