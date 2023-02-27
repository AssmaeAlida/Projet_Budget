package com.example.projet_budget.service;


import com.example.projet_budget.Bean.ExpressionBesoinProd;
import com.example.projet_budget.Bean.Produit;
import com.example.projet_budget.Dao.ExpressionBesoinProdDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ExpressionBesoinProdService {
    @Autowired
    private ExpressionBesoinProdDao expressionBesoinProdDao;

    public int save(ExpressionBesoinProd expressionBesoinProd){
        if (expressionBesoinProdDao.findByCode(expressionBesoinProd.getCode())!=null){
            return -1;
        }else {
            expressionBesoinProdDao.save(expressionBesoinProd);
            return 1;
        }
    }
    public ExpressionBesoinProd findByCode(String code) {
        return expressionBesoinProdDao.findByCode(code);
    }
    @Transactional
    public int deleteByCode(String code) {
        return expressionBesoinProdDao.deleteByCode(code);
    }

    public List<ExpressionBesoinProd> findAll() {
        return expressionBesoinProdDao.findAll();
    }
}
