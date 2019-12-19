package com.it.vehicle.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 关于实体类的状态设定
 */
public enum EntityStatus {
    ADMIN_UNABLE(0,"禁用"),
    ADMIN_ABLE(1,"可用"),
    ADMIN_DELETE(2,"删除"),
    //0未通过 1通过，默认未通过 2空闲中，3运输中 4请假中
    DRIVER_NOT_PASS(0,"未通过"),
    DRIVER_PASS(1,"通过"),
    DRIVER_IN_THE_TRANSPORT(2,"空闲中"),
    DRIVER_IN_FREE(3,"运输中"),
    DRIVER_LEAVE(4,"请假中"),
    //车辆状态 0可用 1维修 2运输 3报废 4已分配货物
    TRUCK_IN_THE_TRANSPORT(0,"可用"),
    TRUCK_FREE(1,"维修"),
    TRUCK_MAINTAIN(2,"运输中"),
    TRUCK_SCRAP(3,"报废"),
    TRUCK_STOCK(4,"已分配运输货物"),
    //0在库 1运输 2已签收 3异常 默认在库
    GOODS_ORDER_IN_THE_TRANSPORT(0,"在库"),
    GOODS_ORDER_FREE(1,"运输中"),
    GOODS_ORDER_RECEIPT(2,"签数"),
    GOODS_EXCEPTION(3,"异常"),
    GOODS_ALLOCATED(4,"已分配"),
    //0运输中 1已签收 2待运输 3异常
    TRANSPORT_IN_THE_TRANSPORT(0,"运输中"),
    TRANSPORT_RECEIPT(1,"已签收"),
    TRANSPORT_FREE(2,"待运输"),
    TRANSPORT_EXCEPTION(3,"异常"),
    SIGNING_NORMAL(1,"正常"),
    SIGNING_EXCEPTION(2,"异常")
    ;
    @Getter
    @Setter
    //错误码
    private Integer code;
    @Getter
    @Setter
    //错误信息
    private String message;

    EntityStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
