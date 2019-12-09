package com.it.vehicle.entity;

import java.util.Date;

public class Driver {
    private Integer driverId;

    private String driverRealName;

    private String driverName;

    private String driverPassword;

    private Date driverBirthday;

    private String driverPhoneNumber;

    private String driverIdNumber;

    private String driverNative;

    private String driverNowAddress;

    private String driverIdImgFrontAdd;

    private String driverIdImgReverseAdd;

    private String licenseId;

    private String allowType;

    private String truckId;

    private Date createTime;

    private Date updateTime;

    private Integer statePass;

    private Integer stateNow;

    private String driverEmail;

    private String driverExperience;

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getDriverRealName() {
        return driverRealName;
    }

    public void setDriverRealName(String driverRealName) {
        this.driverRealName = driverRealName == null ? null : driverRealName.trim();
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName == null ? null : driverName.trim();
    }

    public String getDriverPassword() {
        return driverPassword;
    }

    public void setDriverPassword(String driverPassword) {
        this.driverPassword = driverPassword == null ? null : driverPassword.trim();
    }

    public Date getDriverBirthday() {
        return driverBirthday;
    }

    public void setDriverBirthday(Date driverBirthday) {
        this.driverBirthday = driverBirthday;
    }

    public String getDriverPhoneNumber() {
        return driverPhoneNumber;
    }

    public void setDriverPhoneNumber(String driverPhoneNumber) {
        this.driverPhoneNumber = driverPhoneNumber == null ? null : driverPhoneNumber.trim();
    }

    public String getDriverIdNumber() {
        return driverIdNumber;
    }

    public void setDriverIdNumber(String driverIdNumber) {
        this.driverIdNumber = driverIdNumber == null ? null : driverIdNumber.trim();
    }

    public String getDriverNative() {
        return driverNative;
    }

    public void setDriverNative(String driverNative) {
        this.driverNative = driverNative == null ? null : driverNative.trim();
    }

    public String getDriverNowAddress() {
        return driverNowAddress;
    }

    public void setDriverNowAddress(String driverNowAddress) {
        this.driverNowAddress = driverNowAddress == null ? null : driverNowAddress.trim();
    }

    public String getDriverIdImgFrontAdd() {
        return driverIdImgFrontAdd;
    }

    public void setDriverIdImgFrontAdd(String driverIdImgFrontAdd) {
        this.driverIdImgFrontAdd = driverIdImgFrontAdd == null ? null : driverIdImgFrontAdd.trim();
    }

    public String getDriverIdImgReverseAdd() {
        return driverIdImgReverseAdd;
    }

    public void setDriverIdImgReverseAdd(String driverIdImgReverseAdd) {
        this.driverIdImgReverseAdd = driverIdImgReverseAdd == null ? null : driverIdImgReverseAdd.trim();
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId == null ? null : licenseId.trim();
    }

    public String getAllowType() {
        return allowType;
    }

    public void setAllowType(String allowType) {
        this.allowType = allowType == null ? null : allowType.trim();
    }

    public String getTruckId() {
        return truckId;
    }

    public void setTruckId(String truckId) {
        this.truckId = truckId == null ? null : truckId.trim();
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

    public Integer getStatePass() {
        return statePass;
    }

    public void setStatePass(Integer statePass) {
        this.statePass = statePass;
    }

    public Integer getStateNow() {
        return stateNow;
    }

    public void setStateNow(Integer stateNow) {
        this.stateNow = stateNow;
    }

    public String getDriverEmail() {
        return driverEmail;
    }

    public void setDriverEmail(String driverEmail) {
        this.driverEmail = driverEmail == null ? null : driverEmail.trim();
    }

    public String getDriverExperience() {
        return driverExperience;
    }

    public void setDriverExperience(String driverExperience) {
        this.driverExperience = driverExperience == null ? null : driverExperience.trim();
    }
}