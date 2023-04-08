package com.example.projetBudget.ws;

import com.example.projetBudget.bean.CategorieProduit;
import com.example.projetBudget.bean.Produit;
import com.example.projetBudget.service.CategorieProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categorieproduit")
public class CategorieProduitWs {
    @Autowired
    private CategorieProduitService categorieProduitService;
    @PostMapping("/")
    public int save(@RequestBody Produit produit,@RequestBody List<CategorieProduit> categorieProduits) {
        return categorieProduitService.save(produit, categorieProduits);
    }
    @GetMapping("/code/{code}")
    public CategorieProduit findByCode(@PathVariable String code) {
        return categorieProduitService.findByCode(code);
    }
    @DeleteMapping("/code/{code}")
    @Transactional
    public int deleteByCode(@PathVariable String code) {
        return categorieProduitService.deleteByCode(code);
    }
    @GetMapping("/")
    public List<CategorieProduit> findAll() {
        return categorieProduitService.findAll();
    }
}
