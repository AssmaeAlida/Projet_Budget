package com.example.projetBudget.dao;

import com.example.projetBudget.bean.EntiteAdministratif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntiteAdministratifDao extends JpaRepository<EntiteAdministratif, Long> {
    EntiteAdministratif findByCode(String code);

    int deleteByCode(String code);

}
