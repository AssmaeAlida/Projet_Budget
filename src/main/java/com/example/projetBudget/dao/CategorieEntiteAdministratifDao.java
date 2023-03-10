package com.example.projetBudget.dao;

import com.example.projetBudget.bean.CategorieEntiteAdministratif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieEntiteAdministratifDao extends JpaRepository<CategorieEntiteAdministratif, Long> {
    CategorieEntiteAdministratif findByCode(String code);
    int deleteByCode(String code);



}
