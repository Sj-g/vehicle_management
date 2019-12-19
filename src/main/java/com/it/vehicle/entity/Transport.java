package com.it.vehicle.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
public class Transport {
    private Integer transportId;

    private String transportNumber;

    private String transportOrigin;

    private String transportEnd;

    private Integer transportState;

    private Date createTime;

    private Float transportWeight;

    private String transportPath;

    private Date transportDeliveryTime;

    private List<String> transportRoute;


}