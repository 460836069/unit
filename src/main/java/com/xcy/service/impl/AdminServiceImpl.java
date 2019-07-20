package com.xcy.service.impl;

import com.xcy.mapper.AdminMapper;
import com.xcy.pojo.Admin;
import com.xcy.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;
    @Override
    public int login(Admin admin) {
        return adminMapper.login(admin);
    }

    @Override
    public int isLogin(Admin admin) {
        return  adminMapper.isLogin(admin);
    }

    @Override
    public int zhuce(Admin admin) {
        return adminMapper.zhuce(admin);
    }

    @Override
    public int validatename(String username) {
        return adminMapper.validatename(username);
    }
}
