package com.xcy.mapper;

import com.xcy.pojo.Bank;
import com.xcy.pojo.Pet;
import com.xcy.pojo.PetSingle;
import com.xcy.pojo.SelectByType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PetMapper {
    List<PetSingle> petStrainList();
    List<Pet> selectPet(SelectByType selectByType);
    Pet selectPetById(int id);
    List<Pet> selectPetByAid(int aid);
    List<Bank> showBankName();

    int addBankName(String bank_name);

    int addMyBankCard(Bank bank);
}
