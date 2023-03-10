package com.example.projetBudget.Ws;

import com.example.projetBudget.bean.EntiteAdministratif;
import com.example.projetBudget.Service.EntiteAdministratifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/entite-administratif/")
public class EntiteAdministratifWs {
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
