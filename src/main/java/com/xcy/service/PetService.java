package com.xcy.service;

import com.xcy.pojo.Bank;
import com.xcy.pojo.Pet;
import com.xcy.pojo.PetSingle;

import java.util.List;

public interface PetService {
    List<PetSingle> petStrainList();
    List<Pet> selectPet(String sex, int paixu);
    Pet selectPetById(int id);
    List<Pet> selectPetByAid(int aid);
    List<Bank> showBankName();
    void addBankName(String bank_name);
    void addMyBankCard(String cardpeople, int phonenum);
}
