package com.example.projet_budget.Service;

import com.example.projet_budget.Bean.Budget;
import com.example.projet_budget.Bean.CategorieEntiteAdministratif;
import com.example.projet_budget.Bean.EntiteAdministratif;
import com.example.projet_budget.Dao.CategorieEntiteAdministratifDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    }}
