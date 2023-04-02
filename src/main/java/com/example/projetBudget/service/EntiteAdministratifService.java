package com.example.projetBudget.service;

import com.example.projetBudget.bean.CategorieEntiteAdministratif;
import com.example.projetBudget.bean.EntiteAdministratif;
import com.example.projetBudget.dao.EntiteAdministratifDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class EntiteAdministratifService {
    @Autowired
    private EntiteAdministratifDao entiteAdministratifDao;
@Autowired
private CategorieEntiteAdministratifService categorieEntiteAdministratifService;



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
        }  else {
CategorieEntiteAdministratif categorieEntiteAdministratif= categorieEntiteAdministratifService.findByCode(entiteAdministratif.getCategorieEntiteAdministratif().getCode());
 entiteAdministratif.setCategorieEntiteAdministratif(categorieEntiteAdministratif);
 if (entiteAdministratif.getCategorieEntiteAdministratif()==null){
     return -2;
 }else {

     entiteAdministratifDao.save(entiteAdministratif);

     return 1;
 }

        }
    }

    public List<EntiteAdministratif> findAll() {
        return entiteAdministratifDao.findAll();
    }
}
