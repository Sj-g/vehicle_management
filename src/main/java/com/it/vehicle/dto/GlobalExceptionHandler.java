package com.it.vehicle.dto;

import cn.hutool.http.HttpException;
import cn.hutool.http.Status;
import cn.hutool.json.JSONException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局异常类
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 关于JSR303规范的校验
     * @param e 异常
     * @return 异常信息
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Message handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
        BindingResult bindingResult = e.getBindingResult();
        Map<String,Object> map=new HashMap<>();
        for (FieldError fieldError : bindingResult.getFieldErrors()) {
            map.put(fieldError.getField(), fieldError.getDefaultMessage());
        }
        return Message.fail("校验失败").add(map);
    }

    /**
     *无法连接远程服务器
     * @param e 异常
     * @return 错误信息
     */
    @ExceptionHandler(HttpException.class)
    public Message handleMethodHttpException(HttpException e){
        return Message.status(StatusCode.HTTP_NO_CONNECTION).add("异常信息",(e.getMessage()));
    }
    /**
     *无法获取数据
     * @param e 异常
     * @return 错误信息
     */
    @ExceptionHandler(JSONException.class)
    public Message handleMethod(JSONException e){
        return Message.status(StatusCode.DATABASE_NULL).add("异常信息",(e.getMessage()));
    }
}

