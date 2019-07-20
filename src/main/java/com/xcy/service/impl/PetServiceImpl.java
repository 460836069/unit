package com.xcy.service.impl;

import com.xcy.mapper.PetMapper;
import com.xcy.pojo.Bank;
import com.xcy.pojo.Pet;
import com.xcy.pojo.PetSingle;
import com.xcy.pojo.SelectByType;
import com.xcy.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PetServiceImpl implements PetService {
    @Autowired
    PetMapper petMapper;
    @Override
    public List<PetSingle> petStrainList() {
        return petMapper.petStrainList();
    }

    @Override
    public List<Pet> selectPet(String sex, int paixu) {
        SelectByType selectByType = new SelectByType(sex,paixu);
        return petMapper.selectPet(selectByType);
    }

    @Override
    public Pet selectPetById(int id) {
        return petMapper.selectPetById(id);
    }

    @Override
    public List<Pet> selectPetByAid(int aid) {
        return petMapper.selectPetByAid(aid);
    }

    @Override
    public List<Bank> showBankName() {
        return petMapper.showBankName();
    }

    @Override
    public void addBankName(String bank_name) {
        petMapper.addBankName(bank_name);
    }

    @Override
    public void addMyBankCard(String cardpeople, int phonenum) {
        Bank bank = new Bank(cardpeople,phonenum);
        petMapper.addMyBankCard(bank);
    }
}
