package com.example.projetBudget.ws;

import com.example.projetBudget.bean.Budget;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/api/v1/budget")
public class BudgetWs {
    @Autowired
    private com.example.projetBudget.Service.BudgetService budgetService ;
    @PostMapping("/")
    public int save(@RequestBody Budget budget) {
        return budgetService.save(budget);
    }
@GetMapping("/annee/{annee}")
    public Budget findByAnnee( @PathVariable int annee) {
        return budgetService.findByAnnee(annee);
    }
    @DeleteMapping("/annee/{annee}")
    @Transactional
    public int deleteByAnnee( @PathVariable int annee) {
        return budgetService.deleteByAnnee(annee);
    }
     @GetMapping("/")
    public List<Budget> findAll() {
        return budgetService.findAll();
    }
}
