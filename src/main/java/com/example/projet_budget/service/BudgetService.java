package com.example.projet_budget.service;

import com.example.projet_budget.Bean.Budget;
import com.example.projet_budget.Dao.BudgetDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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





