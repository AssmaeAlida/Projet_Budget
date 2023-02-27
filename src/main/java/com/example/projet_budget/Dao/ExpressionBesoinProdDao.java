package com.example.projet_budget.Dao;

import com.example.projet_budget.Bean.ExpressionBesoinProd;
import com.example.projet_budget.Bean.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpressionBesoinProdDao extends JpaRepository<ExpressionBesoinProd,Long> {

    ExpressionBesoinProd findByQteAndProduitCode( int qte , String code);
    int deleteByQteAndProduitCode (int qte , String code);
}
