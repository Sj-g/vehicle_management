package com.it.vehicle.service;

import com.it.vehicle.entity.Driver;

import java.util.List;

public interface DriverService {
    void driverRegist(Driver driver)throws Exception;

    void addDriver(Driver driver);

    void deleteDriver(Integer driverId);

    void batchDeleteDriver(List<Integer> driverId);

    void updateDriver(Driver driver);

    List<Driver> selectAllDriver();

    Driver selectDriverById(Integer driverId);
}
