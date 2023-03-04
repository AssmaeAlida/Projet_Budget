package com.example.projet_budget.Ws;

import com.example.projet_budget.Bean.AppelAchatProduit;
import com.example.projet_budget.Bean.AppelAchatProduit;
import com.example.projet_budget.Service.AppelAchatProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/appel-achat-prod")
public class AppelAchatProduitWs {
    @Autowired
    private AppelAchatProduitService appelAchatProduitService;
    @GetMapping("/ref/{ref}")
    public AppelAchatProduit findByRef(@PathVariable String ref) {
        return appelAchatProduitService.findByRef(ref);
    }
    @DeleteMapping("/ref/{ref}")
    @Transactional
    public int deleteByRef(@PathVariable String ref) {
        return appelAchatProduitService.deleteByRef(ref);
    }
@PostMapping("/")
    public int save(@RequestBody AppelAchatProduit appelAchatProduit) {
        return appelAchatProduitService.save(appelAchatProduit);
    }
}
