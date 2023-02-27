package com.example.projet_budget.Ws;

import com.example.projet_budget.Bean.CategorieAppelAchat;
import com.example.projet_budget.Service.CategorieAppelAchatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/categorie-appel-achat")
public class CategorieAppelAchatProvided {
    @Autowired
private CategorieAppelAchatService categorieAppelAchatService;
    @GetMapping("/code/{code}")
    public CategorieAppelAchat findByCode(@PathVariable String code) {
        return categorieAppelAchatService.findByCode(code);
    }
    @DeleteMapping ("/code/{code}")
    @Transactional
    public int deleteByCode(@PathVariable String code) {
        return categorieAppelAchatService.deleteByCode(code);
    }
    @PostMapping ("/")
    public int save(@RequestBody CategorieAppelAchat categorieAppelAchat) {
        return categorieAppelAchatService.save(categorieAppelAchat);
    }
}
