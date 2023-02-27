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

    public ExpressionBesoin findByDateExpressionAndTotal(Date dateExpression, double total) {
        return expressionBesoinDao.findByDateExpressionAndTotal(dateExpression, total);
    }
    @Transactional
    public int deleteByDateExpressionAndTotal(Date dateExpression, double total) {
        return expressionBesoinDao.deleteByDateExpressionAndTotal(dateExpression, total);
    }

    public List<ExpressionBesoin> findAll() {
        return expressionBesoinDao.findAll();
    }
}
