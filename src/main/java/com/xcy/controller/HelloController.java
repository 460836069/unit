package com.xcy.controller;

import com.xcy.pojo.Admin;
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
public class HelloController {
    @Autowired
    AdminService adminService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("登录的接口")
    public int showMessage(Admin admin){
        int result = adminService.login(admin);
        System.out.println(result);
        return result;
    }

    @RequestMapping(value = "/zhuce",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("注册的接口")
    public int zhuce(Admin admin){
        int result = adminService.zhuce(admin);
        return result;
    }

    @RequestMapping(value = "/validateusername",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("注册验证用户名的接口")
    public int validateUserName(String username){
        int result = adminService.validatename(username);
        return result;
    }
}
