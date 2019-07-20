package com.xcy.controller;

import com.xcy.mapper.AdminMapper;
import com.xcy.pojo.Admin;
import com.xcy.pojo.LoginResult;
import com.xcy.service.AdminService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Controller
@EnableSwagger2
public class AdminController {
    @Autowired
    AdminService adminService;
    @Autowired
    AdminMapper adminMapper;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("登录的接口")
    public LoginResult showMessage(Admin admin){
        int result = adminService.login(admin);

        if (result == 1){
            int id = adminService.isLogin(admin);
            return new LoginResult(1, id, "用户名验证登陆成功");
        }else {
            return new LoginResult(0, 0, "用户名或密码错误，登陆失败");
        }
    }

    @RequestMapping(value = "/zhuce",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("注册的接口")
    public LoginResult zhuce(Admin admin){
        int result = adminService.zhuce(admin);
        if (result == 1){
            int id = adminService.isLogin(admin);
            return new LoginResult(1, id, "注册成功");
        }else {
            return new LoginResult(0, 0, "注册登陆");
        }
    }

    @RequestMapping(value = "/validateusername",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("注册验证用户名的接口")
    public int validateUserName(String username){
        int result = adminService.validatename(username);
        return result;
    }
}
