package com.it.vehicle.dto;


import lombok.Getter;
import lombok.Setter;

/**
 * 错误码
 */
public enum StatusCode {
    ENTITY_NULL(100,"前台传入数据为空,操作失败"),
    QUERY_RESULT(101,"查询为空"),
    HTTP_NO_CONNECTION(102,"算法远程服务器没有连接"),
    DATABASE_NULL(103,"数据库无法获取数据")
    ;
    @Getter
    @Setter
    //错误码
    private Integer code;
    @Getter
    @Setter
    //错误信息
    private String message;

    StatusCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
