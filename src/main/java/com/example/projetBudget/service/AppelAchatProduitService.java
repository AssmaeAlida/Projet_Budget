package com.example.projetBudget.service;

import com.example.projetBudget.bean.AppelAchat;
import com.example.projetBudget.bean.AppelAchatProduit;
import com.example.projetBudget.dao.AppelAchatProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AppelAchatProduitService {
    @Autowired
    private AppelAchatProduitDao appelAchatProduitDao;
    private AppelAchatService appelAchatService;

    public List<AppelAchatProduit> findByAppelAchatRef(String ref) {
        return appelAchatProduitDao.findByAppelAchatRef(ref);
    }
    @Transactional
    public int deleteByAppelAchatRef(String ref) {
        return appelAchatProduitDao.deleteByAppelAchatRef(ref);
    }

    public List<AppelAchatProduit> findAll() {
        return appelAchatProduitDao.findAll();
    }

    public int save(AppelAchatProduit appelAchatProduit) {
        if (appelAchatProduit.getRef()!=null){
            return -1;

        } else if (appelAchatProduit.getProduit().getCode()==null) {
            return -2;
        } else {
            AppelAchat appelAchat=appelAchatService.findByRef(appelAchatProduit.getAppelAchat().getRef());
            appelAchatProduit.setAppelAchat(appelAchat);
            appelAchatProduitDao.save(appelAchatProduit);
            return 1;
        }

    }
}

