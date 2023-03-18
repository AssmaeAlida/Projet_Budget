package com.example.projetBudget.service;

import com.example.projetBudget.bean.CategorieProduit;
import com.example.projetBudget.bean.Produit;
import com.example.projetBudget.dao.CategorieProduitDao;
import com.example.projetBudget.dao.ProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProduitService {
    @Autowired
    private ProduitDao produitDao;
    @Autowired
    private CategorieProduitService categorieProduitService;

    public int save(Produit produit){
        CategorieProduit loadedCategorieProduit=categorieProduitService.findByCode(produit.getCategorieProduit().getCode());
        produit.setCategorieProduit(loadedCategorieProduit);
        if (produitDao.findByCode(produit.getCode())!=null){
            return -1;
            }
        else if(produit.getCode()==null ){
            return -2;
        }
        else if (produit.getCategorieProduit()==null) {
            return -3;
        }
        else {
            produitDao.save(produit);
            return 1;
        }
    }
    public int update(Produit produit){
        if(produitDao.findByCode(produit.getCode())==null){
            return -4;
        }
        else  produitDao.save(produit);
        return 1;
    }

    public Produit findByCode(String code) {
        return produitDao.findByCode(code);
    }
    @Transactional
    public int deleteByCode(String code) {
        return produitDao.deleteByCode(code);
    }

    public List<Produit> findAll() {
        return produitDao.findAll();
    }
}