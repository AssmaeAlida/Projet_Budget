package com.example.projet_budget.Dao;

import com.example.projet_budget.Bean.EntiteAdministratif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntiteAdministratifDao extends JpaRepository<EntiteAdministratif, Long> {

}
