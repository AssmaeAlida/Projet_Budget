package com.example.projetBudget.dao;

import com.example.projetBudget.bean.ExpressionBesoin;
import com.example.projetBudget.bean.ExpressionBesoinProduit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpressionBesoinProduitDao extends JpaRepository<ExpressionBesoinProduit,Long> {

    ExpressionBesoinProduit findByCode(String code);
    int deleteByCode (String code);

    List<ExpressionBesoinProduit> findByExpressionBesoin(ExpressionBesoin expressionBesoin);
}
