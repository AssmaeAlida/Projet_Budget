package com.example.projet_budget.Dao;

import com.example.projet_budget.Bean.Budget;
import com.example.projet_budget.Bean.BudgetEntiteAdministratif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetEntiteAdministratifDao extends JpaRepository <BudgetEntiteAdministratif,Long> {
    BudgetEntiteAdministratif findBybudget(Budget budget);
    int deleteByBudget(Budget budget);
}
