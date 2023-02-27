package com.example.projet_budget.Dao;

import com.example.projet_budget.Bean.ExpressionBesoinProd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpressionBesoinProdDao extends JpaRepository<ExpressionBesoinProd,Long> {
    ExpressionBesoinProd findByIdExpressionBesoinProd (Long id);
    int deleteByIdExpressionBesoinProd(Long id);
}
