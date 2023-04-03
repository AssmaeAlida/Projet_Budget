package com.example.projetBudget.service;

import com.example.projetBudget.bean.AppelAchat;
import com.example.projetBudget.bean.AppelAchatProduit;
import com.example.projetBudget.bean.CategorieAppelAchat;
import com.example.projetBudget.bean.CategorieEntiteAdministratif;
import com.example.projetBudget.dao.AppelAchatDao;
import com.example.projetBudget.service.AppelAchatProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AppelAchatService {
    @Autowired
    private AppelAchatDao appelAchatDao;
    @Autowired
    private AppelAchatProduitService appelAchatProduitService;
    @Autowired
    private CategorieAppelAchatService categorieAppelAchatService;

    public AppelAchat findByRef(String ref) {
        return appelAchatDao.findByRef(ref);
    }

    @Transactional()
    public int deleteByRef(String ref) {
        appelAchatProduitService.deleteByAppelAchatRef(ref);
        return appelAchatDao.deleteByRef(ref);

    }

    public List<AppelAchat> findAll() {
        return appelAchatDao.findAll();
    }

    public int  save (AppelAchat appelAchat) {
        if(findByRef(appelAchat.getRef())!=null){
            return -1;
        }  else {
            CategorieAppelAchat categorieAppelAchat=categorieAppelAchatService.findByCode(appelAchat.getCategorieAppelAchat().getCode());
            appelAchat.setCategorieAppelAchat(categorieAppelAchat);
            appelAchatDao.save(appelAchat);

                appelAchatProduitService.save(appelAchat,appelAchat.getAppelAchatProduits());
            }
            return 1;
        }

    }




