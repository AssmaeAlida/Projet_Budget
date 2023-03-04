package com.example.projet_budget.Dao;

import com.example.projet_budget.Bean.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetDao extends JpaRepository<Budget,Long> {
   Budget findByAnnee(int annee);
   int deleteByAnnee(int annee);
}
