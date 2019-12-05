package com.it.vehicle.entity;

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

    public Integer getTruckId() {
        return truckId;
    }

    public void setTruckId(Integer truckId) {
        this.truckId = truckId;
    }

    public String getTruckNumber() {
        return truckNumber;
    }

    public void setTruckNumber(String truckNumber) {
        this.truckNumber = truckNumber == null ? null : truckNumber.trim();
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType == null ? null : truckType.trim();
    }

    public String getMotorId() {
        return motorId;
    }

    public void setMotorId(String motorId) {
        this.motorId = motorId == null ? null : motorId.trim();
    }

    public String getChassisId() {
        return chassisId;
    }

    public void setChassisId(String chassisId) {
        this.chassisId = chassisId == null ? null : chassisId.trim();
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany == null ? null : insuranceCompany.trim();
    }

    public String getTruckImageAddress() {
        return truckImageAddress;
    }

    public void setTruckImageAddress(String truckImageAddress) {
        this.truckImageAddress = truckImageAddress == null ? null : truckImageAddress.trim();
    }

    public Float getTruckWeight() {
        return truckWeight;
    }

    public void setTruckWeight(Float truckWeight) {
        this.truckWeight = truckWeight;
    }

    public Float getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(Float carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public Float getTruckHeight() {
        return truckHeight;
    }

    public void setTruckHeight(Float truckHeight) {
        this.truckHeight = truckHeight;
    }

    public Float getTruckWidth() {
        return truckWidth;
    }

    public void setTruckWidth(Float truckWidth) {
        this.truckWidth = truckWidth;
    }

    public Float getTruckControlledAxis() {
        return truckControlledAxis;
    }

    public void setTruckControlledAxis(Float truckControlledAxis) {
        this.truckControlledAxis = truckControlledAxis;
    }

    public Float getTruckLength() {
        return truckLength;
    }

    public void setTruckLength(Float truckLength) {
        this.truckLength = truckLength;
    }
}