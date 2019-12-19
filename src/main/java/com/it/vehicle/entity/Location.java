package com.it.vehicle.entity;

import java.util.Date;

public class Location {
    private Integer locationId;

    private Integer locationTruckId;

    private String truckLatitude;

    private String truckLongitude;

    private Date createTime;

    private Date updateTime;

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Integer getLocationTruckId() {
        return locationTruckId;
    }

    public void setLocationTruckId(Integer locationTruckId) {
        this.locationTruckId = locationTruckId;
    }

    public String getTruckLatitude() {
        return truckLatitude;
    }

    public void setTruckLatitude(String truckLatitude) {
        this.truckLatitude = truckLatitude == null ? null : truckLatitude.trim();
    }

    public String getTruckLongitude() {
        return truckLongitude;
    }

    public void setTruckLongitude(String truckLongitude) {
        this.truckLongitude = truckLongitude == null ? null : truckLongitude.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}