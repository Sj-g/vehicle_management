package com.it.vehicle.controller;

import com.it.vehicle.dto.DriverInfo;
import com.it.vehicle.entity.Driver;
import com.it.vehicle.service.Imp.AdminService;
import com.it.vehicle.service.Imp.DriverService;
import com.it.vehicle.service.Imp.RegisterService;
import com.it.vehicle.utils.DateUtils;
import com.it.vehicle.utils.EmailIdentifyCode;
import com.it.vehicle.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;

@Controller
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @Autowired
    DriverService driverService;

    //司机注册控制
    @RequestMapping("/driverRegister")
    public void driverRegister(HttpServletRequest request,
                               HttpServletResponse response,
                               DriverInfo driverInfo,
                               MultipartFile driverIdImgFront,
                               MultipartFile driverIdImgReverse) throws Exception {
//        System.out.println(driverInfo);
        String driverIdImgFrontFilename = null;
        String driverIdImgReverseFilename = null;

        try {
            //设置上传位置
            String path = request.getSession().getServletContext().getRealPath("/uploads/");
            //判断该路径是否存在如果不存在创建该路径
            File file = new File(path);
            if (!file.exists()) {
                //能进来说明不存在，那就创建该文件
                file.mkdirs();
            }

            //获取上传文件的名称
            driverIdImgFrontFilename = driverInfo.getDriverName()+"IdImgFront"+".jpg";
            driverIdImgReverseFilename = driverInfo.getDriverName()+"IdImgReverse"+".jpg";

            //完成文件上传
            driverIdImgFront.transferTo(new File(path,driverIdImgFrontFilename));
            driverIdImgReverse.transferTo(new File(path,driverIdImgReverseFilename));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }


        Driver driver = new Driver();

        driver.setDriverName(driverInfo.getDriverName());
        driver.setDriverPassword(MD5.getEncryptMD5Str(driverInfo.getDriverPassword()));
        driver.setDriverRealName(driverInfo.getDriverRealName());
        driver.setDriverBirthday(DateUtils.stringToDate(driverInfo.getDriverBirthday(),"yyyy-MM-dd"));
        driver.setDriverIdNumber(driverInfo.getDriverIdNumber());
        driver.setDriverIdImgFrontAdd(request.getSession().getServletContext().getRealPath("/uploads/")+driverIdImgFrontFilename);
        driver.setDriverIdImgReverseAdd(request.getSession().getServletContext().getRealPath("/uploads/")+driverIdImgReverseFilename);
        driver.setDriverPhoneNumber(driverInfo.getDriverPhoneNumber());
        driver.setDriverEmail(driverInfo.getDriverEmail());
        driver.setDriverNative(driverInfo.getDriverNative());
        driver.setDriverNowAddress(driverInfo.getDriverNowAddress());
        driver.setLicenseId(driverInfo.getLicenseId());
        driver.setDriverExperience(driverInfo.getDriverExperience());
        driver.setAllowType(driverInfo.getAllowType());

        driverService.driverRegist(driver);
        request.getRequestDispatcher("/registerSuccess.jsp").forward(request,response);

    }

    //验证码发送
    @RequestMapping("/sendIdentifyCode")
    public void sendIdentifyCode(HttpServletRequest request, String driverEmail) {
//        System.out.println("司机邮箱："+driverEmail);
        HttpSession session = request.getSession();
        String identifyCode = EmailIdentifyCode.achieveCode();
        EmailIdentifyCode.sendAuthCodeEmail(driverEmail, identifyCode);
        session.setAttribute(driverEmail+"identifyCode",identifyCode);
        session.setMaxInactiveInterval(300);
    }

    //校验管理员名是否存在
    @RequestMapping("/checkDriverName")
    public @ResponseBody boolean checkUsername(String driverName ) throws Exception {
        boolean isExist =driverService.isExist(driverName);
        return isExist;
    }

    //异步校验注册验证码
    @RequestMapping("/checkIdentifyCode")
    public @ResponseBody boolean checkIdentifyCode(HttpServletRequest request,String identifyCode,String driverEmail){
        //校验验证码
        String SessIdentifyCode = (String) request.getSession().getAttribute(driverEmail+"identifyCode");

        if (SessIdentifyCode==null||!SessIdentifyCode.equalsIgnoreCase(identifyCode)){
            return false;
        }else {
            return true;
        }
    }

}
