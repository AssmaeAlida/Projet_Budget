package com.example.projet_budget.service;

import com.example.projet_budget.Bean.Produit;
import com.example.projet_budget.Dao.ProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProduitService {
    @Autowired
    private ProduitDao produitDao;

    public int save(Produit produit){
        if (produitDao.findByCode(produit.getCode())!=null){
            return -1;
        }else {
            produitDao.save(produit);
            return 1;
        }
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
