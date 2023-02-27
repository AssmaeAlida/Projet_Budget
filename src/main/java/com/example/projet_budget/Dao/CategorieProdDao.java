package com.example.projet_budget.Dao;

import com.example.projet_budget.Bean.CategorieProd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieProdDao extends JpaRepository<CategorieProd,Long> {
   CategorieProd findByCode(String code);
    int deleteByCode(String code);
}
