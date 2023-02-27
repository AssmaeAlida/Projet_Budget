package com.example.projet_budget.ws;

import com.example.projet_budget.Bean.Budget;
import com.example.projet_budget.service.BudgetService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping
public class BudgetWs {
    @Autowired
    private BudgetService budgetService;
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
