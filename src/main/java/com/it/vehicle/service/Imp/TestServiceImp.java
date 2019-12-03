package com.it.vehicle.service.Imp;

import com.it.vehicle.entity.TestEntity;
import com.it.vehicle.mapper.TestMapper;
import com.it.vehicle.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImp implements TestService {
    private final TestMapper testMapper;

    @Autowired
    public TestServiceImp(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    @Override
    public TestEntity testEntity() {
        return testMapper.testEntity();
    }
}
