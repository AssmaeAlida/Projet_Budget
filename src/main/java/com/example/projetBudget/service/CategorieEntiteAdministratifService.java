package com.example.projetBudget.service;

import com.example.projetBudget.bean.CategorieEntiteAdministratif;
import com.example.projetBudget.dao.CategorieEntiteAdministratifDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CategorieEntiteAdministratifService {
    @Autowired
    private CategorieEntiteAdministratifDao categorieEntiteAdministratifDao;

    public CategorieEntiteAdministratif findByCode(String code) {
        return categorieEntiteAdministratifDao.findByCode(code);
    }

    public int deleteByCode(String code) {
        return categorieEntiteAdministratifDao.deleteByCode(code);
    }



    public int save(CategorieEntiteAdministratif categorieEntiteAdministratif){
        if (findByCode(categorieEntiteAdministratif.getCode()) != null) {
            return -1;
        } else {
            categorieEntiteAdministratifDao.save(categorieEntiteAdministratif);
            return 1;

        }
    }

    public List<CategorieEntiteAdministratif> findAll() {
        return categorieEntiteAdministratifDao.findAll();
    }
}
