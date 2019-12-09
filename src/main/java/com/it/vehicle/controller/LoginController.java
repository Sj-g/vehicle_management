package com.it.vehicle.controller;

import com.it.vehicle.service.Imp.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 管理员和司机登录相关控制
 */

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginService;


    //管理员登录控制
    @RequestMapping("/adminLoginRequest")
    public void adminLoginRequest(HttpServletRequest request,
                                  HttpServletResponse response,
                                  String adminName,
                                  String adminPassword) throws Exception {


        boolean isAdmin = loginService.adminLogin(adminName,adminPassword);

        if (isAdmin){
            //isAdmin为true管理员名和密码正确，存入session并跳转到管理员主页
            request.getSession().setAttribute("admin","adminLogin");
            request.getRequestDispatcher("/WEB-INF/admin/success.jsp").forward(request,response);
        }else {
            //isAdmin为false管理员名和密码错误，往request中存入错误信息跳转到管理员登录页面
            request.setAttribute("adminError","用户名或密码错误！");
            request.getRequestDispatcher("/adminLogin.jsp").forward(request,response);
        }

    }


    //管理员退出控制
    @RequestMapping("/adminLogOut")
    public void adminLogOut(HttpSession session,
                            HttpServletRequest request,
                            HttpServletResponse response) throws Exception {
        //使session失效
        session.invalidate();
        //跳转到管理员登录界面
        request.getRequestDispatcher("/adminLogin.jsp").forward(request,response);
    }


    //司机登录控制
    @RequestMapping("/driverLoginRequest")
    public void driverLoginRequest(HttpServletRequest request,
                                   HttpServletResponse response,
                                   HttpSession session,
                                   String driverName,
                                   String driverPassword)throws Exception{
        boolean isDriver = loginService.driverLogin(driverName,driverPassword);

        if (isDriver){
            //isDriver为true司机名和密码正确，存入session并跳转到司机主页
            request.getSession().setAttribute("driver","driverLogin");
            request.getRequestDispatcher("/WEB-INF/driver/success.jsp").forward(request,response);
        }else {
            //isDriver为false司机名和密码正确，往request中存入错误信息跳转到司机登录页面
            request.setAttribute("driverError","用户名或密码错误或未通过审核！");
            request.getRequestDispatcher("/driverLogin.jsp").forward(request,response);
        }
    }

    //司机退出控制
    @RequestMapping("/driverLogOut")
    public void driverLogOut(HttpSession session,
                            HttpServletRequest request,
                            HttpServletResponse response) throws Exception {
        //使session失效
        session.invalidate();
        request.getRequestDispatcher("/driverLogin.jsp").forward(request,response);
    }

}
