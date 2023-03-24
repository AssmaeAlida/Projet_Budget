package com.example.projetBudget.service;

import com.example.projetBudget.bean.EntiteAdministratif;
import com.example.projetBudget.dao.EntiteAdministratifDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class EntiteAdministratifService {
    @Autowired
    private EntiteAdministratifDao entiteAdministratifDao;



    public EntiteAdministratif findByCode(String code) {
        return entiteAdministratifDao.findByCode(code);
    }
    @Transactional

    public int deleteByCode(String code) {
        return entiteAdministratifDao.deleteByCode(code);
    }

    public int save(EntiteAdministratif entiteAdministratif) {
        if(findByCode(entiteAdministratif.getCode())!=null){
            return -1;
        } else if (entiteAdministratif.getCategorieEntite().getCode()==null) {
            return -2;

        } else {
            entiteAdministratifDao.save(entiteAdministratif);
            return 1;
        }
    }
}
