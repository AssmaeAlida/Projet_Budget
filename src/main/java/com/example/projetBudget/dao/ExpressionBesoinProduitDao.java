package com.example.projetBudget.dao;

import com.example.projetBudget.bean.ExpressionBesoinProduit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpressionBesoinProduitDao extends JpaRepository<ExpressionBesoinProduit,Long> {

    ExpressionBesoinProduit findByCode(String code);
    int deleteByCode (String code);
}
