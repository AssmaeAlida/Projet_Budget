package com.example.projet_budget.service;

import com.example.projet_budget.Bean.BudgetEntiteAdministratif;
import com.example.projet_budget.Dao.BudgetEntiteAdministratifDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetEntiteAdministratifService {
   @Autowired
    private BudgetEntiteAdministratifDao budgetEntiteAdministratifDao;
   public int save(BudgetEntiteAdministratif budgetEntiteAdministratif){
       if (findByRef(budgetEntiteAdministratif.getRef()) != null) {
           return -1;
       }else {
           budgetEntiteAdministratifDao.save(budgetEntiteAdministratif);
           return 1;
       }
   }

    public BudgetEntiteAdministratif findByRef(String ref) {
        return budgetEntiteAdministratifDao.findByRef(ref);
    }

    public int deleteByRef(String ref) {
        return budgetEntiteAdministratifDao.deleteByRef(ref);
    }

    public List<BudgetEntiteAdministratif> findAll() {
        return budgetEntiteAdministratifDao.findAll();
    }
}