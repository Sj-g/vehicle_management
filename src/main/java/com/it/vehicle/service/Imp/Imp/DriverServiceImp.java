package com.it.vehicle.service.Imp.Imp;

import com.it.vehicle.entity.Driver;
import com.it.vehicle.mapper.DriverMapper;
import com.it.vehicle.service.Imp.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceImp implements DriverService {

    @Autowired
    DriverMapper driverMapper;

    @Override
    public void driverRegist(Driver driver) throws Exception {
        driverMapper.insertSelective(driver);
    }
}
