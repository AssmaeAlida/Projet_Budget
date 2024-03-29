package com.example.projetBudget.ws;

import com.example.projetBudget.bean.ExpressionBesoin;
import com.example.projetBudget.bean.ExpressionBesoinProduit;
import com.example.projetBudget.service.ExpressionBesoinProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/api/v1/expressionBesoinProduit")
public class ExpressionBesoinProduitWs {
    @Autowired
    private ExpressionBesoinProduitService expressionBesoinProduitService;
    /*@PostMapping("/")
    public int save(@RequestBody ExpressionBesoinProduit expressionBesoinProduit) {
        return expressionBesoinProduitService.save(expressionBesoinProduit);
    }*/
    @GetMapping("code/{code}")
    public ExpressionBesoinProduit findByCode(@PathVariable String code) {
        return expressionBesoinProduitService.findByCode(code);
    }
    @DeleteMapping("code/{code}")
    @Transactional
    public int deleteByCode(@PathVariable String code) {
        return expressionBesoinProduitService.deleteByCode(code);
    }
     @GetMapping("/")
    public List<ExpressionBesoinProduit> findAll() {
        return expressionBesoinProduitService.findAll();
    }
    @PostMapping("/")
    public int save(@RequestBody ExpressionBesoin expressionBesoin, List<ExpressionBesoinProduit> expressionBesoinProduitList) {
        return expressionBesoinProduitService.save(expressionBesoin, expressionBesoinProduitList);
    }
}
