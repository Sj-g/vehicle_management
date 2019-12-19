package com.it.vehicle.dto;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Message {
    //状态码
    private Integer code;
    //信息
    private String message;
   Map<String,Object> map=new HashMap<>();
    public Message() {
    }

    public Message(String message) {
        this.message = message;
    }

    public Message(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 成功调用
     * @return  状态信息
     */
    public static Message success(){
        return new Message(200,"成功");
    }

    /**
     *  失败调用
     * @return 状态信息
     */
    public static Message fail(String message){
        return new Message(message);
    }

    /**
     * 制定返回错误码
     * @param status 错误码
     * @return 信息
     */
    public static Message status(StatusCode status){
        return new Message(status.getCode(),status.getMessage());
    }

    /**
     * 返回数据
     * @param key 数据描述
     * @param value 数据
     * @return 数据
     */
    public  Message add(String key,Object value){
        this.map.put(key,value);
        return this;
    }

    /**
     * 返回数据
     * @param map 数据
     * @return 本身对象
     */
    public  Message add(Map<String,Object> map){
        this.map=map;
        return this;
    }
}
