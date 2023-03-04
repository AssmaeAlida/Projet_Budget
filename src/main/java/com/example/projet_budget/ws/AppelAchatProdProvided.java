package com.example.projet_budget.Ws;

import com.example.projet_budget.Service.AppelAchatProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/appel-achat-prod")
public class AppelAchatProdProvided {
    @Autowired
    private AppelAchatProdService appelAchatProdService;
@GetMapping("/ref/{ref}")
    public AppelAchatProd findByRef(@PathVariable String ref) {
        return appelAchatProdService.findByRef(ref);
    }
    @GetMapping("appelAchatProd/ref/{ref}")
    public List<AppelAchatProd> findByAppelAchatProdRef(@PathVariable String ref) {
        return appelAchatProdService.findByAppelAchatProdRef(ref);
    }
    @DeleteMapping ("/ref/{ref}")
    @Transactional
    public int deleteByRef(@PathVariable String ref) {
        return appelAchatProdService.deleteByRef(ref);
    }
@PostMapping("/")
    public int save(@RequestBody AppelAchatProd appelAchatProd) {
        return appelAchatProdService.save(appelAchatProd);
    }
}
