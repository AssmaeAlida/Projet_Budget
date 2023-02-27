package com.example.projet_budget.Dao;

import com.example.projet_budget.Bean.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitDao extends JpaRepository<Produit,Long> {
    Produit findByCode(String code);
    int deleteByCode(String code);
}
