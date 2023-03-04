package com.example.projet_budget.Dao;

import com.example.projet_budget.Bean.CategorieProduit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieProduitDao extends JpaRepository<CategorieProduit,Long> {
   CategorieProduit findByCode(String code);
    int deleteByCode(String code);
}
