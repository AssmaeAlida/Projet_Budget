package com.example.projet_budget.ws;

import com.example.projet_budget.Bean.Produit;
import com.example.projet_budget.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ProduitWs {
    @Autowired
    private ProduitService produitService;
     @PostMapping("/")
    public int save(@RequestBody Produit produit) {
        return produitService.save(produit);
    }
     @GetMapping("/code/{code}")
    public Produit findByCode(@PathVariable String code) {
        return produitService.findByCode(code);
    }
    @DeleteMapping("/code/{code}")
    @Transactional
    public int deleteByCode(@PathVariable String code) {
        return produitService.deleteByCode(code);
    }
    @GetMapping("/")
    public List<Produit> findAll() {
        return produitService.findAll();
    }
}