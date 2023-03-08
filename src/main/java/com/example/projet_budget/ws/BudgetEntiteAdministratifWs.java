package com.example.projet_budget.Ws;

import com.example.projet_budget.Bean.BudgetEntiteAdministratif;
import com.example.projet_budget.Service.BudgetEntiteAdministratifService;
import com.example.projet_budget.Bean.CategorieEntiteAdministratif;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/api/v1/budgetEntiteAdministratif")
public class BudgetEntiteAdministratifWs {
    @Autowired
    private BudgetEntiteAdministratifService budgetEntiteAdministratifService;

   @GetMapping("/budget/{budget}")
    public BudgetEntiteAdministratif findByRef(@PathVariable String ref) {
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
