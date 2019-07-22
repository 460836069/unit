package com.xcy.service.impl;

import com.xcy.mapper.AdminPetMapper;
import com.xcy.pojo.AdminPet;
import com.xcy.service.AdminPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class AdminPetServiceImpl implements AdminPetService {
    @Autowired
    AdminPetMapper adminPetMapper;

    @Override
    public List<AdminPet> getPetList() {
        return adminPetMapper.getPetList();
    }

    @Override
    public List<AdminPet> selectByPrice(int a) {
        //正序排列
        if (a == 0) {
            return adminPetMapper.selectByPrice(a);
        }
        //反序排列
        if (a == 1) {
            return adminPetMapper.seleByPrice(a);
        }
        //不限

            return adminPetMapper.getList(a);



    }

    @Override
    public List<AdminPet> selectLike(int aa) {
        //个人
        if(aa == 1 ){
            return adminPetMapper.selectLike(aa);
        }
        //商户
        if(aa == 2 ){
            return adminPetMapper.selectLike1(aa);
        }
        //不限

            return adminPetMapper.selectLike2(aa);


    }

    @Override
    public List<AdminPet> selectName(Model model) {
        if(model != null){
            return adminPetMapper.selectName(model);
        }
       return null;


    }


}
