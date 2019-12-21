package com.it.vehicle.controller;

import com.it.vehicle.service.Imp.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

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
                                  HttpSession session,
                                  String adminName,
                                  String adminPassword,
                                  String verifycode) throws Exception {

        //验证码校验
        session = request.getSession();
        String checkcode_server = (String) session.getAttribute("ADMIN_CHECKCODE_SERVER");
        session.removeAttribute("ADMIN_CHECKCODE_SERVER");//确保验证码一次性

        if (checkcode_server==null||!checkcode_server.equalsIgnoreCase(verifycode)){
            //验证码不正确
            //提示信息
            request.setAttribute("adminError", "验证码错误");

            request.getRequestDispatcher("/adminLogin2.jsp").forward(request,response);
            return;
        }

        //校验密码
        boolean isAdmin = loginService.adminLogin(adminName,adminPassword);

        if (isAdmin){
            //isAdmin为true管理员名和密码正确，存入session并跳转到管理员主页
            request.getSession().setAttribute("admin","adminLogin");
            request.getRequestDispatcher("/WEB-INF/admin/success.jsp").forward(request,response);
        }else {
            //isAdmin为false管理员名和密码错误，往request中存入错误信息跳转到管理员登录页面
            request.setAttribute("adminError","用户名或密码错误！");
            request.getRequestDispatcher("/adminLogin2.jsp").forward(request,response);
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
                                   String driverPassword,
                                   String verifycode)throws Exception{

        //验证码校验
        session = request.getSession();
        String checkcode_server = (String) session.getAttribute("DRIVER_CHECKCODE_SERVER");
        session.removeAttribute("DRIVER_CHECKCODE_SERVER");//确保验证码一次性

        if (checkcode_server==null||!checkcode_server.equalsIgnoreCase(verifycode)){
            //验证码不正确
            //提示信息
            request.setAttribute("driverError", "验证码错误");

            request.getRequestDispatcher("/driverLogin2.jsp").forward(request,response);
            return;
        }

        boolean isDriver = loginService.driverLogin(driverName,driverPassword);

        if (isDriver){
            //isDriver为true司机名和密码正确，存入session并跳转到司机主页
            request.getSession().setAttribute("driver","driverLogin");
            request.getRequestDispatcher("/WEB-INF/driver/success.jsp").forward(request,response);
        }else {
            //isDriver为false司机名和密码正确，往request中存入错误信息跳转到司机登录页面
            request.setAttribute("driverError","用户名或密码错误或未通过审核！");
            request.getRequestDispatcher("/driverLogin2.jsp").forward(request,response);
        }
    }

    //司机退出控制
    @RequestMapping("/driverLogOut")
    public void driverLogOut(HttpSession session,
                            HttpServletRequest request,
                            HttpServletResponse response) throws Exception {
        //使session失效
        session.invalidate();
        request.getRequestDispatcher("/driverLogin2.jsp").forward(request,response);
    }

    //验证码的生成
    @RequestMapping("/checkCode")
    public void CheckCode(HttpServletRequest request, HttpServletResponse response,String name) throws Exception{

        //服务器通知浏览器不要缓存
        response.setHeader("pragma","no-cache");
        response.setHeader("cache-control","no-cache");
        response.setHeader("expires","0");

        //在内存中创建一个长80，宽30的图片，默认黑色背景
        //参数一：长
        //参数二：宽
        //参数三：颜色
        int width = 80;
        int height = 30;
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);


        //获取画笔
        Graphics g = image.getGraphics();
        //设置画笔颜色为灰色
        g.setColor(Color.GRAY);
        //填充图片
        g.fillRect(0,0, width,height);

        //产生4个随机验证码，12Ey
        String checkCode = getCheckCode();
        //将验证码放入HttpSession中
        request.getSession().setAttribute(name+"_CHECKCODE_SERVER",checkCode);

        //设置画笔颜色为黄色
        g.setColor(Color.YELLOW);
        //设置字体的小大
        g.setFont(new Font("黑体",Font.BOLD,24));
        //向图片上写入验证码
        g.drawString(checkCode,15,25);

        //将内存中的图片输出到浏览器
        //参数一：图片对象
        //参数二：图片的格式，如PNG,JPG,GIF
        //参数三：图片输出到哪里去
        ImageIO.write(image,"PNG",response.getOutputStream());

    }

    /**
     * 产生4位随机字符串
     */
    private String getCheckCode() {
        String base = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int size = base.length();
        Random r = new Random();
        StringBuffer sb = new StringBuffer();
        for(int i=1;i<=4;i++){
            //产生0到size-1的随机值
            int index = r.nextInt(size);
            //在base字符串中获取下标为index的字符
            char c = base.charAt(index);
            //将c放入到StringBuffer中去
            sb.append(c);
        }
        return sb.toString();
    }

}
