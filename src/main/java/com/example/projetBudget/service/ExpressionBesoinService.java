package com.example.projetBudget.service;

import com.example.projetBudget.bean.ExpressionBesoin;
import com.example.projetBudget.bean.ExpressionBesoinProduit;
import com.example.projetBudget.dao.ExpressionBesoinDao;
import com.example.projetBudget.dao.ExpressionBesoinProduitDao;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ExpressionBesoinService {
    @Autowired
    private ExpressionBesoinDao expressionBesoinDao;
    @Autowired
    private ExpressionBesoinProduitDao expressionBesoinProduitDao;

    public int save(ExpressionBesoin expressionBesoin) {
        if (expressionBesoinDao.findByCode(expressionBesoin.getCode()) != null) {
            return -1;
        } else {
           expressionBesoinDao.save(expressionBesoin);
           return 1;
        }
    }
    public ExpressionBesoin findByCode(String code) {
        return expressionBesoinDao.findByCode(code);
    }
    @Transactional
    public int deleteByCode(String code) {
        return expressionBesoinDao.deleteByCode(code);
    }

    public List<ExpressionBesoin> findAll() {
        return expressionBesoinDao.findAll();
    }
}