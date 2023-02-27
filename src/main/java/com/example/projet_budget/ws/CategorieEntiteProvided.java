package com.example.projet_budget.Ws;

import com.example.projet_budget.Bean.CategorieEntite;
import com.example.projet_budget.Service.CategorieEntiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/categorie-entite")
public class CategorieEntiteProvided {
    @Autowired
    private CategorieEntiteService categorieEntiteService;
    @GetMapping("/code/{code}")
    public CategorieEntite findByCode(@PathVariable String code) {
        return categorieEntiteService.findByCode(code);
    }
    @DeleteMapping ("/code/{code}")
    @Transactional
    public int deleteByCode(@PathVariable String code) {
        return categorieEntiteService.deleteByCode(code);
    }
    @GetMapping("categorieEntite/code/{code}")
    public List<CategorieEntite> findByCategorieEntiteCode(@PathVariable String code) {
        return categorieEntiteService.findByCategorieEntiteCode(code);
    }
    @PostMapping ("/")
    public int save(@RequestBody CategorieEntite categorieEntite) {
        return categorieEntiteService.save(categorieEntite);
    }
}
