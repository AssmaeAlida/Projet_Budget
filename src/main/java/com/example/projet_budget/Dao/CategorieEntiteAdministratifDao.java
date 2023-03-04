package com.example.projet_budget.Dao;

import com.example.projet_budget.Bean.CategorieEntiteAdministratif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategorieEntiteAdministratifDao extends JpaRepository<CategorieEntiteAdministratif, Long> {
    CategorieEntiteAdministratif findByCode(String code);
    int deleteByCode(String code);

    List<CategorieEntiteAdministratif> findByCategorieEntiteAdministratifCode(String code);



}
