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
    @GetMapping("/qte/{qte}/produit/code/{code}")
    public ExpressionBesoinProd findByQteAndProduitCode(@PathVariable int qte,@PathVariable String code) {
        return expressionBesoinProdService.findByQteAndProduitCode(qte, code);
    }
   @DeleteMapping("/qte/{qte}/produit/code/{code}")
    @Transactional
    public int deleteByQteAndProduitCode(@PathVariable int qte, @PathVariable String code) {
        return expressionBesoinProdService.deleteByQteAndProduitCode(qte, code);
    }
    @GetMapping("/")
    public List<ExpressionBesoinProd> findAll() {
        return expressionBesoinProdService.findAll();
    }
}
