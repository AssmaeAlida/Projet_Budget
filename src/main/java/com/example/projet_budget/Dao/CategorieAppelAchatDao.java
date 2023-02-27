package com.example.projet_budget.Dao;

import com.example.projet_budget.Bean.CategorieAppelAchat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategorieAppelAchatDao extends JpaRepository<CategorieAppelAchat, Long> {
    CategorieAppelAchat findByCode(String code);

    int deleteByCode(String code);





}
