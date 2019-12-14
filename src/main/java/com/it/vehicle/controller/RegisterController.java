package com.it.vehicle.controller;

import com.it.vehicle.dto.DriverInfo;
import com.it.vehicle.entity.Driver;
import com.it.vehicle.service.DriverService;
import com.it.vehicle.service.RegisterService;
import com.it.vehicle.utils.DateUtils;
import com.it.vehicle.utils.EmailIdentifyCode;
import com.it.vehicle.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

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
                               String identifyCode,
                               MultipartFile driverIdImgFront,
                               MultipartFile driverIdImgReverse) throws Exception {

        //校验验证码
        String SessIdentifyCode = (String) request.getSession().getAttribute("identifyCode");

        if (SessIdentifyCode==null||!SessIdentifyCode.equalsIgnoreCase(identifyCode)){
            request.setAttribute("identifyCodeError", "验证码错误");
            request.getRequestDispatcher("/driverRegister.jsp").forward(request,response);
            return;
        }
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
        } catch (IOException | IllegalStateException e) {
            e.printStackTrace();
        }


        Driver driver = new Driver();

        driver.setDriverName(driverInfo.getDriverName());
        driver.setDriverPassword(MD5.getEncryptMD5Str(driverInfo.getDriverPassword()));
        driver.setDriverRealName(driverInfo.getDriverRealName());
        driver.setDriverBirthday(DateUtils.stringToDate(driverInfo.getDriverBirthday(),"yyyy/MM/dd"));
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
        String identifyCode = EmailIdentifyCode.achieveCode();
        HttpSession session = request.getSession();
        session.setAttribute("identifyCode",identifyCode);
        session.setMaxInactiveInterval(60);
        EmailIdentifyCode.sendAuthCodeEmail(driverEmail, identifyCode);
    }

}
