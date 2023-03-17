package com.example.projetBudget.dao;

import com.example.projetBudget.bean.AppelAchatProduit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppelAchatProduitDao extends JpaRepository<AppelAchatProduit, Long> {
    List<AppelAchatProduit> findByAppelAchatRef (String ref);
    int deleteByAppelAchatRef(String ref);






}
