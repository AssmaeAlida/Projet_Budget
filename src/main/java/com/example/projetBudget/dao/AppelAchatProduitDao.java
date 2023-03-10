package com.example.projetBudget.dao;

import com.example.projetBudget.bean.AppelAchatProduit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppelAchatProduitDao extends JpaRepository<AppelAchatProduit, Long> {
    AppelAchatProduit findByRef(String ref);


    int deleteByRef(String ref);






}
