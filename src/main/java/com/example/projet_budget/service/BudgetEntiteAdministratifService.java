package com.example.projet_budget.Service;

import com.example.projet_budget.Bean.Budget;
import com.example.projet_budget.Bean.BudgetEntiteAdministratif;
import com.example.projet_budget.Bean.CategorieEntiteAdministratif;
import com.example.projet_budget.Dao.BudgetDao;
import com.example.projet_budget.Dao.BudgetEntiteAdministratifDao;
import com.example.projet_budget.Dao.CategorieEntiteAdministratifDao;
import com.example.projet_budget.Service.CategorieEntiteAdministratifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import  com.example.projet_budget.service.BudgetService;

import java.util.List;

@Service
public class BudgetEntiteAdministratifService {
   @Autowired
    private BudgetEntiteAdministratifDao budgetEntiteAdministratifDao;
    @Autowired
    private BudgetService budgetService;
    @Autowired
    private CategorieEntiteAdministratifService categorieEntiteAdministratifService;




    public BudgetEntiteAdministratif findByRef(String ref) {
        return budgetEntiteAdministratifDao.findByRef(ref);
    }

    public int deleteByRef(String ref) {
        return budgetEntiteAdministratifDao.deleteByRef(ref);
    }

    public List<BudgetEntiteAdministratif> findAll() {
        return budgetEntiteAdministratifDao.findAll();
    }

    public int save(int annee ,CategorieEntiteAdministratif categorieEntiteAdministratif) {
        Budget budget = budgetService.findByAnnee(annee);
        double pourcentage=categorieEntiteAdministratif.getPourcentage();
        if (budget==null){
            return -1;
        } else if (pourcentage==0) {
            return -1;
        }
        else {
            double mt =budget.getMontantTotal()*pourcentage;
          BudgetEntiteAdministratif budgetEntiteAdministratif1 = new BudgetEntiteAdministratif();
          budgetEntiteAdministratif1.setMontantTotal(mt);
          budgetEntiteAdministratif1.setCategorieEntiteAdministratif(categorieEntiteAdministratif);
          budgetEntiteAdministratif1.setBudget(budget);
          BudgetEntiteAdministratifDao.save(budgetEntiteAdministratif1);
          return 1;
        }

    }
}
