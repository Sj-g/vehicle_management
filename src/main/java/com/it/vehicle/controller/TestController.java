package com.it.vehicle.controller;

import com.it.vehicle.entity.TestEntity;
import com.it.vehicle.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping("/test")
    @ResponseBody
    public TestEntity test() {
        return testService.testEntity();
    }
}
