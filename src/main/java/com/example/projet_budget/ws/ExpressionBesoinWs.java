package com.example.projet_budget.ws;

import com.example.projet_budget.Bean.ExpressionBesoin;
import com.example.projet_budget.service.ExpressionBesoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController @RequestMapping("/api/v1/expressionbesoin")
public class ExpressionBesoinWs {
    @Autowired
    private ExpressionBesoinService expressionBesoinService;
    @PostMapping("/")
    public int save(@RequestBody ExpressionBesoin expressionBesoin) {
        return expressionBesoinService.save(expressionBesoin);
    }
    @GetMapping("/code/{code}")
    public ExpressionBesoin findByCode(@PathVariable String code) {
        return expressionBesoinService.findByCode(code);
    }
    @DeleteMapping("/code{code}")
    @Transactional
    public int deleteByCode(@PathVariable String code) {
        return expressionBesoinService.deleteByCode(code);
    }
    @PostMapping("/")
    public List<ExpressionBesoin> findAll() {
        return expressionBesoinService.findAll();
    }
}
