package com.it.vehicle.utils;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class myHttpUtils {
    /**
     * get请求方法
     *
     * @param url    url地址
     * @param params 参数
     * @return 请求后的资源
     */
    public static JSONObject getResult(String url, Map<String, Object> params) {
        //调用httpRequest方法，这个方法主要用于请求地址，并加上请求参数
        String string = HttpUtil.get(url, params);
        //处理返回的JSON数据并返回
        return JSONUtil.parseObj(string);
    }
    /**
     * get请求方法
     *
     * @param url    url地址
     * @return 请求后的资源
     */
    public static JSONObject getResultNoParam(String url) {
        //调用httpRequest方法，这个方法主要用于请求地址，并加上请求参数
        String string = HttpUtil.get(url);
        //处理返回的JSON数据并返回
        return JSONUtil.parseObj(string);
    }

    /**
     * post请求方法
     *
     * @param url    url地址
     * @param params 参数
     * @return 请求后的资源
     */
    public static String postResult(String url, Map<String, Object> params) {
        String string = HttpUtil.post(url, params);
        //处理返回的JSON数据并返回
        JSONObject pageBean = JSONUtil.parseObj(string);
        return pageBean.toString();
    }
}
