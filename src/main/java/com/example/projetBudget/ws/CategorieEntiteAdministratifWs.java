package com.example.projetBudget.ws;

import com.example.projetBudget.bean.CategorieEntiteAdministratif;
import com.example.projetBudget.service.CategorieEntiteAdministratifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/categorie-entite")
public class CategorieEntiteAdministratifWs {
    @Autowired
    private CategorieEntiteAdministratifService categorieEntiteAdministratifService;
    @GetMapping("/code/{code}")
    public CategorieEntiteAdministratif findByCode(@PathVariable String code) {
        return categorieEntiteAdministratifService.findByCode(code);
    }
    @DeleteMapping ("/code/{code}")
    @Transactional
    public int deleteByCode(@PathVariable String code) {
        return categorieEntiteAdministratifService.deleteByCode(code);
    }


    @PostMapping ("/")
    public int save(@RequestBody CategorieEntiteAdministratif categorieEntiteAdministratif) {
        return categorieEntiteAdministratifService.save(categorieEntiteAdministratif);
    }

}
