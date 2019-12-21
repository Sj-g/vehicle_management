package com.it.vehicle.service.Imp;

import com.it.vehicle.entity.Driver;

public interface DriverService {
    void driverRegist(Driver driver)throws Exception;

    boolean isExist(String driverName)throws Exception;
}
