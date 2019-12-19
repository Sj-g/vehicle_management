package com.it.vehicle.service.Imp;

import com.it.vehicle.dto.EntityStatus;
import com.it.vehicle.entity.Driver;
import com.it.vehicle.entity.DriverExample;
import com.it.vehicle.mapper.DriverMapper;
import com.it.vehicle.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DriverServiceImp implements DriverService {

    @Autowired
    DriverMapper driverMapper;

    @Override
    public void driverRegist(Driver driver) {
        driverMapper.insertSelective(driver);
    }

    @Override
    public void addDriver(Driver driver) {
        driverMapper.insertSelective(driver);
    }

    @Override
    public void deleteDriver(Integer driverId) {
        driverMapper.deleteByPrimaryKey(driverId);
    }

    @Override
    public void batchDeleteDriver(List<Integer> driverId) {
        DriverExample driverExample=new DriverExample();
        DriverExample.Criteria criteria = driverExample.createCriteria();
        criteria.andDriverIdIn(driverId);
        driverMapper.deleteByExample(driverExample);
    }

    @Override
    public void updateDriver(Driver driver) {
        driverMapper.updateByPrimaryKeySelective(driver);
    }

    @Override
    public List<Driver> selectAllDriver() {
        DriverExample driverExample=new DriverExample();
        DriverExample.Criteria criteria = driverExample.createCriteria();
        List<Integer> list=new ArrayList<>();
        list.add(EntityStatus.DRIVER_IN_FREE.getCode());
        list.add(EntityStatus.DRIVER_IN_THE_TRANSPORT.getCode());
        list.add(EntityStatus.DRIVER_LEAVE.getCode());
        list.add(EntityStatus.DRIVER_PASS.getCode());
        list.add(EntityStatus.DRIVER_NOT_PASS.getCode());
        criteria.andStateNowIn(list);
        return driverMapper.selectByExample(driverExample);
    }

    @Override
    public Driver selectDriverById(Integer driverId) {
        return driverMapper.selectByPrimaryKey(driverId);
    }



}
