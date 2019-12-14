package com.it.vehicle.service;

public interface LoginService {

    //管理员登录
    boolean adminLogin(String username, String password)throws Exception;
    //司机登录
    boolean driverLogin(String driverName, String driverPassword)throws Exception;

}
