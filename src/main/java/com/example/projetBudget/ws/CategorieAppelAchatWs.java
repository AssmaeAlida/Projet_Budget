package com.example.projetBudget.ws;

import com.example.projetBudget.bean.CategorieAppelAchat;
import com.example.projetBudget.service.CategorieAppelAchatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/categorie-appel-achat")
public class CategorieAppelAchatWs {
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
