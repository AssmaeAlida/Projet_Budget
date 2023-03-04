package com.example.projet_budget.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface AppelAchatProdDao extends JpaRepository<AppelAchatProd, Long> {
    AppelAchatProd findByRef(String ref);
    List <AppelAchatProd> findByAppelAchatProdRef(String ref);

    int deleteByRef(String ref);






}
