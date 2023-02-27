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

    public ExpressionBesoinProd findByQteAndProduitCode(int qte, String code) {
        return expressionBesoinProdDao.findByQteAndProduitCode(qte, code);
    }
    @Transactional
    public int deleteByQteAndProduitCode(int qte, String code) {
        return expressionBesoinProdDao.deleteByQteAndProduitCode(qte, code);
    }

    public List<ExpressionBesoinProd> findAll() {
        return expressionBesoinProdDao.findAll();
    }
}
