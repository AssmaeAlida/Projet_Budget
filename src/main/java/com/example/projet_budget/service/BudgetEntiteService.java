package com.example.projet_budget.service;

import com.example.projet_budget.Bean.Budget;
import com.example.projet_budget.Dao.BudgetEntiteAdministratifDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetEntiteService {
   @Autowired
    private BudgetEntiteAdministratifDao budgetEntiteDao;
   public int save(BudgetEntite budgetEntite){
       if (findBybudget(budgetEntite.getBudget()) != null) {
           return -1;
       }else {
           budgetEntiteDao.save(budgetEntite);
           return 1;
       }
   }

    public BudgetEntite findBybudget(Budget budget) {
        return budgetEntiteDao.findBybudget(budget);
    }
     @Transactional
    public int deleteByBudget(Budget budget) {
        return budgetEntiteDao.deleteByBudget(budget);
    }

    public List<BudgetEntite> findAll() {
        return budgetEntiteDao.findAll();
    }
}
