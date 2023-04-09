package com.example.projetBudget.service;


import com.example.projetBudget.bean.ExpressionBesoin;
import com.example.projetBudget.bean.ExpressionBesoinProduit;
import com.example.projetBudget.bean.Produit;
import com.example.projetBudget.dao.ExpressionBesoinProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ExpressionBesoinProduitService {
    @Autowired
    private ExpressionBesoinProduitDao expressionBesoinProduitDao;
    @Autowired
    private ProduitService produitService;

    public int save (ExpressionBesoin expressionBesoin,List<ExpressionBesoinProduit>expressionBesoinProduitList) {
        for (ExpressionBesoinProduit expressionBesoinProduit:expressionBesoinProduitList){
            expressionBesoinProduit.setExpressionBesoin(expressionBesoin);
            Produit produit=produitService.findByCode(expressionBesoinProduit.getProduit().getCode());
            expressionBesoinProduit.setProduit(produit);
            expressionBesoinProduitDao.save(expressionBesoinProduit);

        }
        return 1;
    }

    public ExpressionBesoinProduit findByCode(String code) {
        return expressionBesoinProduitDao.findByCode(code);
    }
   @Transactional
    public int deleteByCode(String code) {
        return expressionBesoinProduitDao.deleteByCode(code);
    }

    public List<ExpressionBesoinProduit> findAll() {
        return expressionBesoinProduitDao.findAll();
    }
}