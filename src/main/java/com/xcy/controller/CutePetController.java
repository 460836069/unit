package com.xcy.controller;

import com.xcy.pojo.*;
import com.xcy.service.PetService;
import com.xcy.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@Controller
@EnableSwagger2
public class CutePetController {
    @Autowired
    PetService petService;
    @RequestMapping(value="/strainlist",method = RequestMethod.POST)
    @ResponseBody
    public String petStrainList(){
        List<PetSingle> list = petService.petStrainList();
        System.out.println(JsonUtils.objectToJson(list));
        String s = JsonUtils.objectToJson(list);
        return s;
    }
    @RequestMapping(value="/selectPet",method = RequestMethod.POST)
    @ResponseBody
    //0代表升序，1代表降序 他们是字符串类型
    public String selectPet(@RequestParam(required = false)String sex,@RequestParam(required = false,defaultValue="0")int paixu){
        List<Pet> list = petService.selectPet(sex,paixu);
        String s = JsonUtils.objectToJson(list);
        return s;
    }
    @RequestMapping(value = "/selectPetById",method = RequestMethod.POST)
    @ResponseBody
    public String selectPetById(int id){
        Pet pet = petService.selectPetById(id);
        String s = JsonUtils.objectToJson(pet);
        return s;
    }
    @RequestMapping(value = "/selectPetByBoss",method = RequestMethod.POST)
    @ResponseBody
    public String selectPetByAid(int aid){
        List<Pet> list = petService.selectPetByAid(aid);
        String s = JsonUtils.objectToJson(list);
        return s;
    }
    @RequestMapping(value = "/showBankName",method = RequestMethod.POST)
    @ResponseBody
    public String showBankName(){
        List<Bank> list = petService.showBankName();
        String s = JsonUtils.objectToJson(list);
        return s;
    }
    @RequestMapping(value = "/addBankName",method = RequestMethod.POST)
    @ResponseBody
    public void addBankName(String bank_name){
        petService.addBankName(bank_name);
    }
    @RequestMapping(value = "/addMyBankCard",method = RequestMethod.POST)
    @ResponseBody
    public void addMyBankCard(String cardpeople,int phonenum){
        petService.addMyBankCard(cardpeople,phonenum);
    }
    @RequestMapping(value = "/confirmPay",method = RequestMethod.POST)
    @ResponseBody
    public String confirmPay(int id){
        Pet pet = petService.selectPetById(id);//得到了宠物的信息，主要是为了要价格，用于确定支付页面显示的价格
        int petprice = pet.getPetprice();        //宠物价格
        String order_petname = pet.getPetname(); //订单信息
        int aid= pet.getAid();
        Admin admin = petService.selectAdminInfoById(aid);//为了得到用户的银行卡名字以及尾号
        String card_num = admin.getCard_num(); //银行卡号
        int id1 = admin.getBank_id();
        Bank bank =petService.selectBankNameById(id1);
        String bankName =bank.getBank_name(); // 银行名字
        PayPageInfo payPageInfo = new PayPageInfo(order_petname,card_num,bankName,petprice);
        String s = JsonUtils.objectToJson(payPageInfo);
        return s;
    }
}
