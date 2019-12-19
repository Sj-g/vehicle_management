package com.it.vehicle.service;

import com.it.vehicle.dto.Coordinate;
import com.it.vehicle.entity.Location;

import java.util.List;

public interface LocationService {

    void addLocation(Location coordinate);

    List<Coordinate> getRoute(Integer transportId);

    Coordinate getTruckLocation(Integer truckId);
}
