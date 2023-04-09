package com.example.projetBudget.ws;
import com.example.projetBudget.bean.Budget;
import com.example.projetBudget.bean.BudgetEntiteAdministratif;
import com.example.projetBudget.service.BudgetEntiteAdministratifService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/api/v1/budgetEntiteAdministratif")
public class BudgetEntiteAdministratifWs {
    @Autowired
    private BudgetEntiteAdministratifService budgetEntiteAdministratifService;

   @GetMapping("/ref/{ref}")
    public BudgetEntiteAdministratif findByRef(@PathVariable String ref) {
        return budgetEntiteAdministratifService.findByRef(ref);
    }
  @DeleteMapping("ref/{ref}")
    @Transactional
    public int deleteByRef(@PathVariable String ref)
  {
        return budgetEntiteAdministratifService.deleteByRef(ref);
    }
   @GetMapping("/")
    public List<BudgetEntiteAdministratif> findAll() {
        return budgetEntiteAdministratifService.findAll();

    }
    /*@PostMapping("/")
    public int save(@RequestBody BudgetEntiteAdministratif budgetEntiteAdministratif) {
        return budgetEntiteAdministratifService.save(budgetEntiteAdministratif);
    }*/
    /*@PutMapping("/ref/{ref}/annee/{annee}")
    public int calculer(@PathVariable String ref,@PathVariable int annee) {
        return budgetEntiteAdministratifService.calculer(ref, annee);
    }*/
    @PostMapping("/")
    public int save(@RequestBody Budget budget, List<BudgetEntiteAdministratif> budgetEntiteAdministratif) {
        return budgetEntiteAdministratifService.save(budget, budgetEntiteAdministratif);
    }
}
