package com.example.projet_budget.Dao;

import com.example.projet_budget.Bean.Budget;
import com.example.projet_budget.Bean.BudgetEntite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetEntiteDao extends JpaRepository<BudgetEntite,Long> {
    BudgetEntite findBybudget(Budget budget);
    int deleteByBudget(Budget budget);
}
