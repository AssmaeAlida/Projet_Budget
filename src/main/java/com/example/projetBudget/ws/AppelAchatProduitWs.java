package com.example.projetBudget.ws;

import com.example.projetBudget.bean.AppelAchat;
import com.example.projetBudget.bean.AppelAchatProduit;
import com.example.projetBudget.service.AppelAchatProduitService;
import com.example.projetBudget.service.AppelAchatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/appel-achat-produit")
public class AppelAchatProduitWs {
    @Autowired
    private AppelAchatProduitService appelAchatProduitService;
    @GetMapping("/AppelAchat/ref/{ref}")
    public List<AppelAchatProduit> findByAppelAchatRef(@PathVariable String ref) {
        return appelAchatProduitService.findByAppelAchatRef(ref);
    }
   @DeleteMapping("/AppelAchat/ref/{ref}")
    @Transactional
    public int deleteByAppelAchatRef(@PathVariable String ref) {
        return appelAchatProduitService.deleteByAppelAchatRef(ref);
    }
   @GetMapping("/")
    public List<AppelAchatProduit> findAll() {
        return appelAchatProduitService.findAll();
    }
   @PostMapping("/")
    public int save(@RequestBody AppelAchatProduit appelAchatProduit) {
        return appelAchatProduitService.save(appelAchatProduit);
    }
}