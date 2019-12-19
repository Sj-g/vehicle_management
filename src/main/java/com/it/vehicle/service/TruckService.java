package com.it.vehicle.service;

import com.it.vehicle.entity.Truck;

import java.util.List;

public interface TruckService {
    void addTruck(Truck truck);

    void deleteTruckById(Integer truckId);

    void batchDeleteTruck(List<Integer> truckIds);

    void updateTruck(Truck truck);

    List<Truck> selectAll();

    Truck selectTruckById(Integer truckId);

    Truck selectTruckByTransportId(Integer transportId);
}
