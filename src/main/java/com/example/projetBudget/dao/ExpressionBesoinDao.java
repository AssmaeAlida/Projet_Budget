package com.example.projetBudget.dao;

import com.example.projetBudget.bean.ExpressionBesoin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpressionBesoinDao extends JpaRepository<ExpressionBesoin,Long> {
    ExpressionBesoin findByCode(String code);
    int deleteByCode(String code);
}
