package com.example.projet_budget.Ws;

import com.example.projet_budget.Bean.EntiteAdministratif;
import com.example.projet_budget.Service.EntiteAdministratifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/entite-administratif/")
public class EntiteAdministratifProvided {
    @Autowired
   private EntiteAdministratifService entiteAdministratifService;
    @GetMapping("/code/{code}")
    public EntiteAdministratif findByCode(@PathVariable String code) {
        return entiteAdministratifService.findByCode(code);
    }
    @DeleteMapping ("/code/{code}")
    @Transactional
    public int deleteByCode(@PathVariable String code) {
        return entiteAdministratifService.deleteByCode(code);
    }
    @PostMapping ("/")
    public int save(@RequestBody EntiteAdministratif entiteAdministratif) {
        return entiteAdministratifService.save( entiteAdministratif);
    }
}
