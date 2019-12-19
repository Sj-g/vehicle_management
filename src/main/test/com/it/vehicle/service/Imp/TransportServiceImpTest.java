package com.it.vehicle.service.Imp;

import com.it.vehicle.service.TransportService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-mvc.xml", "classpath:spring/spring-mybatis.xml","classpath:mybatis/mybatis-config.xml"})
public class TransportServiceImpTest {
    @Autowired
    private TransportService transportService;
    @Test
    public void selectAllTransport() {
        transportService.selectAllTransport();
    }
    @Test
    public void addTransport() {
        transportService.addTransport();
    }
}