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
     @GetMapping("/date/{date}/total/{total}")
    public ExpressionBesoin findByDateExpressionAndTotal(@PathVariable Date dateExpression, @PathVariable double total) {
        return expressionBesoinService.findByDateExpressionAndTotal(dateExpression, total);
    }
    @DeleteMapping("/date/{date}/total/{total}")
    @Transactional
    public int deleteByDateExpressionAndTotal(@PathVariable Date dateExpression, @PathVariable double total) {
        return expressionBesoinService.deleteByDateExpressionAndTotal(dateExpression, total);
    }
    @GetMapping("/")
    public List<ExpressionBesoin> findAll() {
        return expressionBesoinService.findAll();
    }
}
