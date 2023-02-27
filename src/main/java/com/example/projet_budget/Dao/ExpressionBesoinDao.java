package com.example.projet_budget.Dao;

import com.example.projet_budget.Bean.ExpressionBesoin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface ExpressionBesoinDao extends JpaRepository<ExpressionBesoin,Long> {
    ExpressionBesoin findByDateExpressionAndTotal(Date dateExpression,double total);
    int deleteByDateExpressionAndTotal(Date dateExpression,double total);
}
