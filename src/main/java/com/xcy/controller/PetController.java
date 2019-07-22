package com.xcy.controller;


import com.xcy.pojo.AdminPet;
import com.xcy.service.AdminPetService;
import com.xcy.utils.JsonUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RestController
@EnableSwagger2
public class PetController {
    @Autowired
    AdminPetService adminPetService;
    //附近的主页面
    @RequestMapping(value = "/getPetList", method = RequestMethod.GET)
    @ApiOperation("附近的主页面接口")
    public String getPetList() {
        List<AdminPet> list = adminPetService.getPetList();
        String s = JsonUtils.objectToJson(list);
        return s;
    }
    //根据价格查询
    @RequestMapping(value = "/selectPetprice",method = RequestMethod.GET)
    @ApiOperation("根据价格查询接口")
    public String selectPetprice(int a) {
        List<AdminPet> list = adminPetService.selectByPrice(a);
        String s = JsonUtils.objectToJson(list);
        return s;

    }
    //根据来源查询
    @RequestMapping(value = "/selectLike",method = RequestMethod.GET)
    @ApiOperation("根据来源查询的接口")
    public String selectLike(int aa){
        List<AdminPet> list = adminPetService.selectLike(aa);
        String s = JsonUtils.objectToJson(list);
        return s;

    }
    //搜索
    @RequestMapping(value = "/selectName",method = RequestMethod.GET)
    @ApiOperation("搜索接口")
    public String selectName(Model model){

        List<AdminPet> list = adminPetService.selectName(model);
        String s = JsonUtils.objectToJson(list);
        return s;

    }
}
