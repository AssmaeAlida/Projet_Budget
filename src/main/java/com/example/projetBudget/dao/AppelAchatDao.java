package com.example.projetBudget.dao;

import com.example.projetBudget.bean.AppelAchat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppelAchatDao extends JpaRepository<AppelAchat, Long> {
    AppelAchat findByRef(String ref);
    int deleteByRef(String ref);




}
