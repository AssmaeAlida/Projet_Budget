package com.example.projet_budget.service;

import com.example.projet_budget.Bean.ExpressionBesoin;
import com.example.projet_budget.Dao.ExpressionBesoinDao;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.List;

@Service
public class ExpressionBesoinService {
    @Autowired
    private ExpressionBesoinDao expressionBesoinDao;

    public int save(ExpressionBesoin expressionBesoin){
        if (expressionBesoinDao.findByCode(expressionBesoin.getCode())!=null){
            return -1;
        }else {
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


