package com.it.vehicle.controller.user;

import com.it.vehicle.entity.Signing;
import com.it.vehicle.entity.Transport;
import com.it.vehicle.service.SigningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class SigningController {
    private  final SigningService signingService;

    @Autowired
    public SigningController(SigningService signingService) {
        this.signingService = signingService;
    }

    /**
     * 页面转发到签收表
     */
    public String getSigningPage(){
        return "";
    }

    /**
     * 获得签收表并保存到数据库
     * Signing中保存了transport的Id
     */
    public ModelAndView addSigning(HttpServletResponse response, HttpServletRequest request, ModelAndView modelAndView, Signing signing, MultipartFile SigningPicture){
        if (signing!=null&&signing.getTransportId()!=null){
            signingService.addSigning(signing);
            String  SigningPictureFilename= null;
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
                SigningPictureFilename =signing.getTransportNumber()+".jpg";

                //完成文件上传
                SigningPicture.transferTo(new File(path,SigningPictureFilename));
            } catch (IOException | IllegalStateException e) {
                e.printStackTrace();
            }

        }
        modelAndView.setViewName("");
        return modelAndView;
    }

}
