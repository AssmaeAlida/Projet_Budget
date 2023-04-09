package com.example.projetBudget.dao;

import com.example.projetBudget.bean.CategorieProduit;
import jakarta.persistence.ManyToOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategorieProduitDao extends JpaRepository<CategorieProduit,Long> {
   CategorieProduit findByCode(String code);
    int deleteByCode(String code);
}
