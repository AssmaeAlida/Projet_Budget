package com.example.projet_budget.ws;

import com.example.projet_budget.Bean.Budget;
import com.example.projet_budget.Bean.BudgetEntite;
import com.example.projet_budget.service.BudgetEntiteService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping
public class BudgetEntiteWs {
    @Autowired
    private BudgetEntiteService budgetEntiteService;
   @PostMapping("/")
    public int save(@RequestBody BudgetEntite budgetEntite) {
        return budgetEntiteService.save(budgetEntite);
    }
   @GetMapping("/budget/{budget}")
    public BudgetEntite findBybudget(Budget budget) {
        return budgetEntiteService.findBybudget(budget);
    }
  @DeleteMapping("budget/{budget}")
    @Transactional
    public int deleteByBudget(@PathVariable Budget budget) {
        return budgetEntiteService.deleteByBudget(budget);
    }
@GetMapping("/")
    public List<BudgetEntite> findAll() {
        return budgetEntiteService.findAll();
    }
}
