package com.bitzh.service.impl;

import com.bitzh.dao.AdminDao;
import com.bitzh.domain.Admin;
import com.bitzh.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    public void setAdminDao(AdminDao adminDao) {
        this.adminDao = adminDao;
    }

    @Override
    public Admin findAdmin(String aAccount, String aPassword) {
        Admin admin = this.adminDao.findAdmin(aAccount, aPassword);
        return admin;
    }
}
