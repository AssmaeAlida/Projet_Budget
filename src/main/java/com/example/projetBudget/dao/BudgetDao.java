package com.example.projetBudget.dao;

import com.example.projetBudget.bean.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetDao extends JpaRepository<Budget,Long> {
   Budget findByAnnee(int annee);
   int deleteByAnnee(int annee);
}
