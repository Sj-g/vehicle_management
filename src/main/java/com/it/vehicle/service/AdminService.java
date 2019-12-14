package com.it.vehicle.service;

import com.it.vehicle.entity.Admin;

import java.util.List;

public interface AdminService {
    void addAdmin(Admin admin);

    void deleteAdmin(Integer adminId);

    void updateAdmin(Admin admin);

    /**
     * 批量删除
     * @param adminIds 管理员集合
     */
    void batchDeleteAdmin(List<Integer> adminIds);



    Admin selectAdminById(Integer adminId);

    List<Admin> selectAdminByStatus();
}
