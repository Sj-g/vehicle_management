package com.it.vehicle.entity;

import java.util.Date;

public class Signing {
    private Integer signingId;

    private String transportNumber;

    private String signingIdentityCardNumber;

    private Integer signingStatus;

    private String signingNote;

    private Date createTime;

    private Integer transportId;

    private String pictureAddress;

    public Integer getSigningId() {
        return signingId;
    }

    public void setSigningId(Integer signingId) {
        this.signingId = signingId;
    }

    public String getTransportNumber() {
        return transportNumber;
    }

    public void setTransportNumber(String transportNumber) {
        this.transportNumber = transportNumber == null ? null : transportNumber.trim();
    }

    public String getSigningIdentityCardNumber() {
        return signingIdentityCardNumber;
    }

    public void setSigningIdentityCardNumber(String signingIdentityCardNumber) {
        this.signingIdentityCardNumber = signingIdentityCardNumber == null ? null : signingIdentityCardNumber.trim();
    }

    public Integer getSigningStatus() {
        return signingStatus;
    }

    public void setSigningStatus(Integer signingStatus) {
        this.signingStatus = signingStatus;
    }

    public String getSigningNote() {
        return signingNote;
    }

    public void setSigningNote(String signingNote) {
        this.signingNote = signingNote == null ? null : signingNote.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getTransportId() {
        return transportId;
    }

    public void setTransportId(Integer transportId) {
        this.transportId = transportId;
    }

    public String getPictureAddress() {
        return pictureAddress;
    }

    public void setPictureAddress(String pictureAddress) {
        this.pictureAddress = pictureAddress == null ? null : pictureAddress.trim();
    }
}