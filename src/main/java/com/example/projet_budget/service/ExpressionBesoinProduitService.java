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
    private ExpressionBesoinProduitDao expressionBesoinProdDao;

    public int save(ExpressionBesoinProduit expressionBesoinProd){
        if (expressionBesoinProdDao.findByCode(expressionBesoinProd.getCode())!=null){
            return -1;
        }else {
            expressionBesoinProdDao.save(expressionBesoinProd);
            return 1;
        }
    }
    public ExpressionBesoinProduit findByCode(String code) {
        return expressionBesoinProdDao.findByCode(code);
    }
    @Transactional
    public int deleteByCode(String code) {
        return expressionBesoinProdDao.deleteByCode(code);
    }

    public List<ExpressionBesoinProduit> findAll() {
        return expressionBesoinProdDao.findAll();
    }
}
