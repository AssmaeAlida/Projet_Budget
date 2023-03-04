package com.example.projet_budget.ws;

import com.example.projet_budget.Bean.CategorieProduit;
import com.example.projet_budget.service.CategorieProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class CategorieProduitWs {
    @Autowired
    private CategorieProduitService categorieProduitService;
    @PostMapping("/")
    public int save(@RequestBody CategorieProduit categorieProduit) {
        return categorieProduitService.save(categorieProduit);
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
