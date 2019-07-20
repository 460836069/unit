package com.xcy.service;


import com.xcy.pojo.AdminPet;
import org.springframework.ui.Model;

import java.util.List;

public interface AdminPetService {
    List<AdminPet> getPetList();

    List<AdminPet> selectByPrice(int a);


    List<AdminPet> selectLike(Model model);

    List<AdminPet> selectName(Model model);
}
