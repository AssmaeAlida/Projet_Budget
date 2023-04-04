package com.example.projetBudget.service;

import com.example.projetBudget.bean.AppelAchat;
import com.example.projetBudget.bean.AppelAchatProduit;
import com.example.projetBudget.bean.Produit;
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
    private ProduitService produitService;

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

    public int save(AppelAchat appelAchat,List<AppelAchatProduit>appelAchatProduits) {
        for (AppelAchatProduit appelAchatProduit:appelAchatProduits){
            appelAchatProduit.setAppelAchat(appelAchat);

            Produit produit=produitService.findByCode(appelAchatProduit.getProduit().getCode());
            appelAchatProduit.setProduit(produit);
            appelAchatProduitDao.save(appelAchatProduit);
        }
return 1;}

}

