package com.example.projet_budget.Dao;

import com.example.projet_budget.Bean.ExpressionBesoin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpressionBesoinDao extends JpaRepository<ExpressionBesoin,Long> {
    ExpressionBesoin findByExpressionBesoinId(Long id);
    int deleteByExpressionBesoinId(Long id);
}
