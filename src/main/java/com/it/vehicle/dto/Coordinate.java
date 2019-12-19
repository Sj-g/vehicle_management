package com.it.vehicle.dto;

import lombok.Data;

@Data
public class Coordinate {
    //经度
    private Double longitude;
    //纬度
    private Double latitude;
    //地址
    private String address;
}
