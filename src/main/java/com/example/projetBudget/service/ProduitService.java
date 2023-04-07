package com.example.projetBudget.service;

import com.example.projetBudget.bean.CategorieProduit;
import com.example.projetBudget.bean.Produit;
import com.example.projetBudget.dao.CategorieProduitDao;
import com.example.projetBudget.dao.ProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProduitService {
    @Autowired
    private ProduitDao produitDao;
    @Autowired
    private CategorieProduitService categorieProduitService;

    public int save(Produit produit){
        if (produitDao.findByCode(produit.getCode())!=null){
            return -1;
            }
        else if(produit.getCode()==null ){
            return -2;
        }
        else {
            ajoutProduit(produit);
            produitDao.save(produit);
            categorieProduitService.save(produit,produit.getCategorieProduits());
            return 1;
        }
    }

    private void ajoutProduit(Produit produit) {
        BigDecimal prix=BigDecimal.ZERO;
        for(CategorieProduit categorieProduit:produit.getCategorieProduits()){
            prix=prix.add(categorieProduit.getPrix());
        }
    }

    public int update(Produit produit){
        if(produitDao.findByCode(produit.getCode())==null){
            return -1;
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
