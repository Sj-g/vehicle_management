package com.it.vehicle.entity;

import lombok.Data;

@Data
public class Truck {
    private Integer truckId;

    private String truckNumber;

    private String truckType;

    private String motorId;

    private String chassisId;

    private String insuranceCompany;

    private String truckImageAddress;

    private Float truckWeight;

    private Float carryingCapacity;

    private Float truckHeight;

    private Float truckWidth;

    private Float truckControlledAxis;

    private Float truckLength;

    private Integer truckStatus;

    private Integer truckTransportId;

    private Integer truckDriverId;
    /**
     * 司机的信息
     */
    private Driver driver;

    }