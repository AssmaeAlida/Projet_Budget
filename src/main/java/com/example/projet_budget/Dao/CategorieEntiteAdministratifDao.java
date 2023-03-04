package com.example.projet_budget.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategorieEntiteAdministratifDao extends JpaRepository<CategorieEntite, Long> {
    CategorieEntite findByCode(String code);
    int deleteByCode(String code);

    List<CategorieEntite> findByCategorieEntiteCode(String code);



}
