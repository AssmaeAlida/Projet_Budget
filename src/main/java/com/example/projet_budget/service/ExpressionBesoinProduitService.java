package com.example.projet_budget.service;


import com.example.projet_budget.Bean.ExpressionBesoinProduit;
import com.example.projet_budget.Dao.ExpressionBesoinProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ExpressionBesoinProduitService {
    @Autowired
    private ExpressionBesoinProduitDao expressionBesoinProduitDao;

    public int save(ExpressionBesoinProduit expressionBesoinProduit) {
        if (expressionBesoinProduitDao.findByCode(expressionBesoinProduit.getCode()) != null) {
            return -1;
        } else {
            expressionBesoinProduitDao.save(expressionBesoinProduit);
            return 1;
        }
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