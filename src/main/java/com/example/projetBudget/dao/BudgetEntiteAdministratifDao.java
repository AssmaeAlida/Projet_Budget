package com.example.projetBudget.dao;

import com.example.projetBudget.bean.BudgetEntiteAdministratif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetEntiteAdministratifDao extends JpaRepository <BudgetEntiteAdministratif,Long> {
    BudgetEntiteAdministratif findByRef(String ref);
    int deleteByRef(String ref);
}
