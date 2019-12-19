package com.it.vehicle.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-mvc.xml", "classpath:spring/spring-mybatis.xml"})
public class AdminMapperTest {
    @Autowired
    private AdminMapper adminMapper;
    @Test
    public void selectByPrimaryKey() {
        System.out.println(adminMapper.selectByPrimaryKey(100));
    }
}