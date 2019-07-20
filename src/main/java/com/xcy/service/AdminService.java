package com.xcy.service;

import com.xcy.pojo.Admin;

public interface AdminService {

    int login(Admin admin);

    int isLogin(Admin admin);

    int zhuce(Admin admin);

    int validatename(String username);
}
