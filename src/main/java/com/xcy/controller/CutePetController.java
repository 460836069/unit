package com.xcy.controller;

import com.xcy.pojo.Bank;
import com.xcy.pojo.Pet;
import com.xcy.pojo.PetSingle;
import com.xcy.service.PetService;
import com.xcy.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@Controller
@EnableSwagger2
public class CutePetController {
    @Autowired
    PetService petService;
    @RequestMapping("/strainlist")
    @ResponseBody
    public String petStrainList(){
        List<PetSingle> list = petService.petStrainList();
        System.out.println(JsonUtils.objectToJson(list));
        String s = JsonUtils.objectToJson(list);
        return s;
    }
    @RequestMapping("/selectPet")
    @ResponseBody
    //0代表升序，1代表降序 他们是字符串类型
    public String selectPet(@RequestParam(required = false)String sex,@RequestParam(required = false,defaultValue="0")int paixu){
        List<Pet> list = petService.selectPet(sex,paixu);
        String s = JsonUtils.objectToJson(list);
        return s;
    }
    @RequestMapping("/selectPetById")
    @ResponseBody
    public String selectPetById(int id){
        Pet pet = petService.selectPetById(id);
        String s = JsonUtils.objectToJson(pet);
        return s;
    }
    @RequestMapping("/selectPetByBoss")
    @ResponseBody
    public String selectPetByAid(int aid){
        List<Pet> list = petService.selectPetByAid(aid);
        String s = JsonUtils.objectToJson(list);
        return s;
    }
    @RequestMapping("/showBankName")
    @ResponseBody
    public String showBankName(){
        List<Bank> list = petService.showBankName();
        String s = JsonUtils.objectToJson(list);
        return s;
    }
    @RequestMapping("/addBankName")
    @ResponseBody
    public void addBankName(String bank_name){
        petService.addBankName(bank_name);
    }
    @RequestMapping("/addMyBankCard")
    @ResponseBody
    public void addMyBankCard(String cardpeople,int phonenum){
        petService.addMyBankCard(cardpeople,phonenum);
    }
}
