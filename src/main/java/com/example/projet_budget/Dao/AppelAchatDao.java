package com.example.projet_budget.Dao;

import com.example.projet_budget.Bean.AppelAchat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface AppelAchatDao extends JpaRepository<AppelAchat, Long> {
    AppelAchat findByRef(String ref);
    int deleteByRef(String ref);




}
