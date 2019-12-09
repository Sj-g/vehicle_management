package com.it.vehicle.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminRequestInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String info = (String) request.getSession().getAttribute("admin");
        if (info!=null&&info.equals("adminLogin")){
            //session有指定的值已经登录，可以放行
            return true;
        }else {
            //session中没有指定的值，该管理员未登录将其请求拦截
            request.setAttribute("adminError","您还没有登录，请先登录！");
            request.getRequestDispatcher("/adminLogin.jsp").forward(request,response);
            return false;
        }

    }
}
