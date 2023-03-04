package com.example.projet_budget.ws;

import com.example.projet_budget.Bean.CategorieEntiteAdministratif;
import com.example.projet_budget.Service.CategorieEntiteAdministratifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/categorie-entite")
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
    @GetMapping("categorieEntiteAdministratif/code/{code}")
    public List<CategorieEntiteAdministratif> findByCategorieEntiteAdministratifCode(@PathVariable String code) {
        return categorieEntiteAdministratifService.findByCategorieEntiteCode(code);
    }
    @PostMapping ("/")
    public int save(@RequestBody CategorieEntiteAdministratif categorieEntiteAdministratif) {
        return categorieEntiteAdministratifService.save(categorieEntiteAdministratif);
    }
}
