package com.example.projet_budget.Dao;

import com.example.projet_budget.Bean.AppelAchatProduit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface AppelAchatProduitDao extends JpaRepository<AppelAchatProduit, Long> {
    AppelAchatProduit findByRef(String ref);
    List <AppelAchatProduit> findByAppelAchatProduitRef(String ref);

    int deleteByRef(String ref);






}
