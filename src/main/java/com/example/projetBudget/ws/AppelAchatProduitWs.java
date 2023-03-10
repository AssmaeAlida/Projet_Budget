package com.example.projetBudget.Ws;

import com.example.projetBudget.bean.AppelAchatProduit;
import com.example.projetBudget.Service.AppelAchatProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

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
