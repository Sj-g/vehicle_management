package com.it.vehicle.service.Imp.Imp;

import com.it.vehicle.entity.Admin;
import com.it.vehicle.entity.AdminExample;
import com.it.vehicle.entity.Driver;
import com.it.vehicle.entity.DriverExample;
import com.it.vehicle.mapper.AdminMapper;
import com.it.vehicle.mapper.DriverMapper;
import com.it.vehicle.service.Imp.LoginService;
import com.it.vehicle.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImp implements LoginService {

    @Autowired
    AdminMapper adminMapper;

    @Autowired
    DriverMapper driverMapper;

    //管理员登录逻辑的编写
    @Override
    public boolean adminLogin(String adminName, String adminPassword) throws Exception {

        //将密码加密
        adminPassword = MD5.getEncryptMD5Str(adminPassword);

        //逻辑判断
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andAdminNameEqualTo(adminName);
        criteria.andAdminPasswordEqualTo(adminPassword);
        List<Admin> admins = adminMapper.selectByExample(adminExample);

        //返回结果
        if (admins != null && admins.size() > 0) {
            return true;
        } else {
            return false;
        }

    }

    //司机登录的逻辑编写
    @Override
    public boolean driverLogin(String driverName, String driverPassword) throws Exception {

        //将密码加密
        driverPassword = MD5.getEncryptMD5Str(driverPassword);

        //逻辑判断
        DriverExample driverExample = new DriverExample();
        DriverExample.Criteria criteria = driverExample.createCriteria();
        criteria.andDriverNameEqualTo(driverName);
        criteria.andDriverPasswordEqualTo(driverPassword);
        criteria.andStatePassEqualTo(1);
        List<Driver> drivers = driverMapper.selectByExample(driverExample);

        //返回结果
        if (drivers!=null&&drivers.size()>0){
            return true;
        }else {
            return false;
        }
    }


}
