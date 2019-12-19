package com.it.vehicle.controller.admin;

import com.it.vehicle.entity.Signing;
import com.it.vehicle.service.SigningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SigningController {
    private  final SigningService signingService;
    @Autowired
    public SigningController(SigningService signingService) {
        this.signingService = signingService;
    }
    /**
     * 获取回签单的页面
     * 查询根据状态查询回签单
     */
    public ModelAndView getSigningPage(ModelAndView modelAndView){
        List<Signing> signingList=signingService.selectSigning();
        modelAndView.addObject("signingList",signingList);
        modelAndView.setViewName("admin/Signing");
        return modelAndView;
    }
}
