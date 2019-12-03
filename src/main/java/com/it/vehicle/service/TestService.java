package com.it.vehicle.service;

import com.it.vehicle.entity.TestEntity;
import com.it.vehicle.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;

public interface TestService {
    public TestEntity testEntity();
}
