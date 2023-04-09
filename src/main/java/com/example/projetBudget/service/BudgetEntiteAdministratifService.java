package com.example.projetBudget.service;


import com.example.projetBudget.bean.Budget;
import com.example.projetBudget.bean.BudgetEntiteAdministratif;
import com.example.projetBudget.bean.CategorieEntiteAdministratif;
import com.example.projetBudget.dao.BudgetEntiteAdministratifDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BudgetEntiteAdministratifService {
    @Autowired
    private BudgetEntiteAdministratifDao budgetEntiteAdministratifDao;


    public BudgetEntiteAdministratif findByRef(String ref) {
        return budgetEntiteAdministratifDao.findByRef(ref);
    }

    public int deleteByRef(String ref) {
        return budgetEntiteAdministratifDao.deleteByRef(ref);
    }

    public List<BudgetEntiteAdministratif> findAll() {
        return budgetEntiteAdministratifDao.findAll();
    }

    public int save(Budget budget,List<BudgetEntiteAdministratif>budgetEntiteAdministratif) {
        for (BudgetEntiteAdministratif budgetEntiteAdministratif1:budgetEntiteAdministratif){
            budgetEntiteAdministratif1.setBudget(budget);
            budgetEntiteAdministratif1.setMontantTotal(budget.getMontantTotal()*budgetEntiteAdministratif1.getPourcentage());

            budgetEntiteAdministratifDao.save(budgetEntiteAdministratif1);
        }
        return 1;

        }


    /*public int calculer(String ref, int annee) {
        Budget budget = budgetService.findByAnnee(annee);
        BudgetEntiteAdministratif budgetEntiteAdministratif = findByRef(ref);
        CategorieEntiteAdministratif categorieEntiteAdministratif = budgetEntiteAdministratif.getCategorieEntiteAdministratif();
        double pourcentage = categorieEntiteAdministratif.getPourcentage();
        double newMontantTotal = budget.getMontantTotal() * pourcentage;
        double newMontantInvertissement = budget.getMontantInvestissement() * pourcentage;
        double newMontantFonctionnement = budget.getMontantFonctionnement() * pourcentage;
        budgetEntiteAdministratif.setMontantTotal(newMontantTotal);
        budgetEntiteAdministratif.setBudget(budget);
        budgetEntiteAdministratif.setMontantFonctionnement(newMontantFonctionnement);
        budgetEntiteAdministratif.setMontantInvestissement(newMontantInvertissement);

        budgetEntiteAdministratifDao.save(budgetEntiteAdministratif);
        return 1;
    }*/


}
