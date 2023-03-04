package com.example.projet_budget.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieProduitDao extends JpaRepository<CategorieProd,Long> {
   CategorieProd findByCode(String code);
    int deleteByCode(String code);
}
