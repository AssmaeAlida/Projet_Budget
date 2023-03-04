package com.example.projet_budget.Ws;

import com.example.projet_budget.Bean.BudgetEntiteAdministratif;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping
public class BudgetEntiteAdministratifWs {
    @Autowired
    private com.example.projet_budget.service.BudgetEntiteAdministratifService budgetEntiteAdministratifService;
   @PostMapping("/")
    public int save(@RequestBody BudgetEntiteAdministratif budgetEntite) {
        return budgetEntiteAdministratifService.save(budgetEntite);
    }
   @GetMapping("/budget/{budget}")
    public BudgetEntiteAdministratif findByRef(String ref) {
        return budgetEntiteAdministratifService.findByRef(ref);
    }
  @DeleteMapping("budget/{budget}")
    @Transactional
    public int deleteByRef(@PathVariable String ref) {
        return budgetEntiteAdministratifService.deleteByRef(ref);
    }
@GetMapping("/")
    public List<BudgetEntiteAdministratif> findAll() {
        return budgetEntiteAdministratifService.findAll();
    }
}
