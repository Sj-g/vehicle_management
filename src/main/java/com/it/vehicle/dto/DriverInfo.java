package com.it.vehicle.dto;


public class DriverInfo {

    private String driverName;
    private String driverPassword;
    private String driverRealName;
    private String driverBirthday;
    private String driverIdNumber;
    private String driverPhoneNumber;
    private String driverEmail;
    private String driverNative;
    private String driverNowAddress;
    private String licenseId;
    private String driverExperience;
    private String allowType;

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverPassword() {
        return driverPassword;
    }

    public void setDriverPassword(String driverPassword) {
        this.driverPassword = driverPassword;
    }

    public String getDriverRealName() {
        return driverRealName;
    }

    public void setDriverRealName(String driverRealName) {
        this.driverRealName = driverRealName;
    }

    public String getDriverBirthday() {
        return driverBirthday;
    }

    public void setDriverBirthday(String driverBirthday) {
        this.driverBirthday = driverBirthday;
    }

    public String getDriverIdNumber() {
        return driverIdNumber;
    }

    public void setDriverIdNumber(String driverIdNumber) {
        this.driverIdNumber = driverIdNumber;
    }

    public String getDriverPhoneNumber() {
        return driverPhoneNumber;
    }

    public void setDriverPhoneNumber(String driverPhoneNumber) {
        this.driverPhoneNumber = driverPhoneNumber;
    }

    public String getDriverEmail() {
        return driverEmail;
    }

    public void setDriverEmail(String driverEmail) {
        this.driverEmail = driverEmail;
    }

    public String getDriverNative() {
        return driverNative;
    }

    public void setDriverNative(String driverNative) {
        this.driverNative = driverNative;
    }

    public String getDriverNowAddress() {
        return driverNowAddress;
    }

    public void setDriverNowAddress(String driverNowAddress) {
        this.driverNowAddress = driverNowAddress;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public String getDriverExperience() {
        return driverExperience;
    }

    public void setDriverExperience(String driverExperience) {
        this.driverExperience = driverExperience;
    }

    public String getAllowType() {
        return allowType;
    }

    public void setAllowType(String allowType) {
        this.allowType = allowType;
    }

    @Override
    public String toString() {
        return "DriverInfo{" +
                "driverName='" + driverName + '\'' +
                ", driverPassword='" + driverPassword + '\'' +
                ", driverRealName='" + driverRealName + '\'' +
                ", driverBirthday='" + driverBirthday + '\'' +
                ", driverIdNumber='" + driverIdNumber + '\'' +
                ", driverPhoneNumber='" + driverPhoneNumber + '\'' +
                ", driverEmail='" + driverEmail + '\'' +
                ", driverNative='" + driverNative + '\'' +
                ", driverNowAddress='" + driverNowAddress + '\'' +
                ", licenseId='" + licenseId + '\'' +
                ", driverExperience='" + driverExperience + '\'' +
                ", allowType='" + allowType + '\'' +
                '}';
    }
}
