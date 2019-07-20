package com.xcy.mapper;

import com.xcy.pojo.AdminPet;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.ui.Model;

import java.util.List;


@Mapper
public interface AdminPetMapper {
    List<AdminPet> getPetList();

    List<AdminPet> selectByPrice(int a);

    List<AdminPet> seleByPrice(int a);

    List<AdminPet> getList(int a);


    List<AdminPet> selectLike(Model model);

    List<AdminPet> selectName(Model model);
}
