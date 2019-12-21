package com.it.vehicle.service.Imp.Imp;

import com.it.vehicle.entity.Driver;
import com.it.vehicle.entity.DriverExample;
import com.it.vehicle.mapper.DriverMapper;
import com.it.vehicle.service.Imp.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImp implements DriverService {

    @Autowired
    DriverMapper driverMapper;

    @Override
    public void driverRegist(Driver driver) throws Exception {
        driverMapper.insertSelective(driver);
    }

    @Override
    public boolean isExist(String driverName) throws Exception {

        DriverExample driverExample = new DriverExample();
        DriverExample.Criteria criteria = driverExample.createCriteria();
        criteria.andDriverNameEqualTo(driverName);
        List<Driver> drivers = driverMapper.selectByExample(driverExample);
        if (drivers!=null&&drivers.size()>0){
            return false;
        }else {
            return true;
        }
    }
}
