package com.it.vehicle.entity;

import java.util.Date;

public class GoodsOrder {
    private Integer orderId;

    private String orderNumber;

    private String senderName;

    private String senderPhone;

    private String senderAddress;

    private String receiveName;

    private String receivePhone;

    private String receiveAddress;

    private Float orderWeight;

    private Float orderVolume;

    private String orderNote;

    private Integer orderStatus;

    private Integer transportId;

    private Date deliveryTime;

    private String orderConsign;

    private String orderCarrier;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName == null ? null : senderName.trim();
    }

    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone == null ? null : senderPhone.trim();
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress == null ? null : senderAddress.trim();
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName == null ? null : receiveName.trim();
    }

    public String getReceivePhone() {
        return receivePhone;
    }

    public void setReceivePhone(String receivePhone) {
        this.receivePhone = receivePhone == null ? null : receivePhone.trim();
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress == null ? null : receiveAddress.trim();
    }

    public Float getOrderWeight() {
        return orderWeight;
    }

    public void setOrderWeight(Float orderWeight) {
        this.orderWeight = orderWeight;
    }

    public Float getOrderVolume() {
        return orderVolume;
    }

    public void setOrderVolume(Float orderVolume) {
        this.orderVolume = orderVolume;
    }

    public String getOrderNote() {
        return orderNote;
    }

    public void setOrderNote(String orderNote) {
        this.orderNote = orderNote == null ? null : orderNote.trim();
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getTransportId() {
        return transportId;
    }

    public void setTransportId(Integer transportId) {
        this.transportId = transportId;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getOrderConsign() {
        return orderConsign;
    }

    public void setOrderConsign(String orderConsign) {
        this.orderConsign = orderConsign == null ? null : orderConsign.trim();
    }

    public String getOrderCarrier() {
        return orderCarrier;
    }

    public void setOrderCarrier(String orderCarrier) {
        this.orderCarrier = orderCarrier == null ? null : orderCarrier.trim();
    }
}