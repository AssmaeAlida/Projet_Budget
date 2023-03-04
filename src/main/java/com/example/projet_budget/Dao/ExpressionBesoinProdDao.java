package com.example.projet_budget.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpressionBesoinProdDao extends JpaRepository<ExpressionBesoinProd,Long> {

    ExpressionBesoinProd findByCode( String code);
    int deleteByCode (String code);
}
