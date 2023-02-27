package com.example.projet_budget.Dao;

import com.example.projet_budget.Bean.ExpressionBesoin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpressionBesoinDao extends JpaRepository<ExpressionBesoin,Long> {
    ExpressionBesoin findByIdExpressionBesoin(Long id);
    int deleteByIdExpressionBesoin(Long id);
}
