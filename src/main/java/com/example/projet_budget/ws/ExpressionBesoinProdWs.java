package com.example.projet_budget.ws;

import com.example.projet_budget.Bean.ExpressionBesoinProd;
import com.example.projet_budget.service.ExpressionBesoinProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/api/v1/expressionBesoinProd")
public class ExpressionBesoinProdWs {
    @Autowired
    private ExpressionBesoinProdService expressionBesoinProdService;
    @PostMapping("/")
    public int save(@RequestBody ExpressionBesoinProd expressionBesoinProd) {
        return expressionBesoinProdService.save(expressionBesoinProd);
    }
     @GetMapping("/code/{code}/")
    public ExpressionBesoinProd findByCode(@PathVariable String code) {
        return expressionBesoinProdService.findByCode(code);
    }
    @DeleteMapping("/code/{code}/")
    @Transactional
    public int deleteByCode(@PathVariable String code) {
        return expressionBesoinProdService.deleteByCode(code);
    }
     @GetMapping("/")
    public List<ExpressionBesoinProd> findAll() {
        return expressionBesoinProdService.findAll();
    }
}
