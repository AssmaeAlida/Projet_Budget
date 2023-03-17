package com.example.projetBudget.service;

import com.example.projetBudget.bean.AppelAchat;
import com.example.projetBudget.bean.AppelAchatProduit;
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
    private AppelAchatProduitService appelAchatProduitService;

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
        } else if (appelAchat.getCategorieAppelAchat().getCode()==null) {
            return -2;


        } else {
            appelAchatDao.save(appelAchat);

            for(AppelAchatProduit a :appelAchat.getAppelAchatProduits()){
                a.setAppelAchat(appelAchat);
                appelAchatProduitService.save(a);
            }
            return 1;
        }

    }



}
