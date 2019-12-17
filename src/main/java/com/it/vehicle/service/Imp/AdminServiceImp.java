package com.it.vehicle.service.Imp;

import com.it.vehicle.dto.EntityStatus;
import com.it.vehicle.entity.Admin;
import com.it.vehicle.entity.AdminExample;
import com.it.vehicle.mapper.AdminMapper;
import com.it.vehicle.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminServiceImp implements AdminService {
    private  final AdminMapper adminMapper;
    @Autowired
    public AdminServiceImp(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    @Override
    public void addAdmin( Admin admin) {
        adminMapper.insertSelective(admin);
    }

    @Override
    public void deleteAdmin(Integer adminId) {
        adminMapper.deleteByPrimaryKey(adminId);
    }

    @Override
    public void updateAdmin(Admin admin) {
        adminMapper.updateByPrimaryKeySelective(admin);
    }

    @Override
    public void batchDeleteAdmin(List<Integer> adminId) {
        AdminExample adminExample=new AdminExample();
        AdminExample.Criteria criteria=adminExample.createCriteria();
        criteria.andAdminIdIn(adminId);
        adminMapper.deleteByExample(adminExample);
    }

    @Override
    public List<Admin> selectAdminByStatus() {
        AdminExample adminExample=new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        List<Integer> list=new ArrayList<>();
        list.add(EntityStatus.ADMIN_ABLE.getCode());
        list.add(EntityStatus.ADMIN_DELETE.getCode());
        list.add(EntityStatus.ADMIN_UNABLE.getCode());
        criteria.andAdminStatusIn(list);
        return adminMapper.selectByExample(adminExample);
    }

    @Override
    public Admin selectAdminById(Integer adminId) {
        return adminMapper.selectByPrimaryKey(adminId);
    }
}
