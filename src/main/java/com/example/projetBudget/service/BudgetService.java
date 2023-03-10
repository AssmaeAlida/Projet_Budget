package com.example.projetBudget.Service;

import com.example.projetBudget.bean.Budget;
import com.example.projetBudget.dao.BudgetDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {
    @Autowired
    private BudgetDao budgetDao;

    public int save(Budget budget){
        if (findByAnnee(budget.getAnnee()) != null) {
            return -1;
        } else {
            budgetDao.save(budget);
            return 1;

        }

        }




    public Budget findByAnnee(int annee) {
        return budgetDao.findByAnnee(annee);
    }
   @Transactional
    public int deleteByAnnee(int annee) {
        return budgetDao.deleteByAnnee(annee);
    }

    public List<Budget> findAll() {
        return budgetDao.findAll();
    }
}





