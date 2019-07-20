package com.xcy.controller;


import com.xcy.pojo.AdminPet;
import com.xcy.service.AdminPetService;
import com.xcy.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PetController {
    @Autowired
    AdminPetService adminPetService;
    //附近的主页面
    @RequestMapping(value = "/seckillList", method = RequestMethod.GET)
    public String getPetList() {
        List<AdminPet> list = adminPetService.getPetList();
        String s = JsonUtils.objectToJson(list);
        return s;
    }
    //根据价格查询
    @RequestMapping("/aa")
    public String selectPetprice(int a) {
        List<AdminPet> list = adminPetService.selectByPrice(a);
        String s = JsonUtils.objectToJson(list);
        return s;

    }
    //根据来源查询
    @RequestMapping("/ff")
    public String selectLike(Model model){
        List<AdminPet> list = adminPetService.selectLike(model);
        String s = JsonUtils.objectToJson(list);
        return s;

    }
    @RequestMapping("/selectName")
    public String selectName(Model model){
        List<AdminPet> list = adminPetService.selectName(model);
        String s = JsonUtils.objectToJson(list);
        return s;

    }
}
