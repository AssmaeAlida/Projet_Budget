package com.example.projetBudget.ws;

import com.example.projetBudget.bean.Produit;
import com.example.projetBudget.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produit")
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
