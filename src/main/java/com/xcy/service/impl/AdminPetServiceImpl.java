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
        if (a == 0) {
            return adminPetMapper.selectByPrice(a);
        }
        if (a == 1) {
            return adminPetMapper.seleByPrice(a);
        }
        return adminPetMapper.getList(a);

    }

    @Override
    public List<AdminPet> selectLike(Model model) {
        return adminPetMapper.selectLike(model);
    }

    @Override
    public List<AdminPet> selectName(Model model) {

        return adminPetMapper.selectName(model);
    }


}
