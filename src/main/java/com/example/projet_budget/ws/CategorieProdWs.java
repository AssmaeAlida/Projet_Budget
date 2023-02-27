package com.example.projet_budget.ws;

import com.example.projet_budget.Bean.CategorieProd;
import com.example.projet_budget.service.CategorieProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class CategorieProdWs {
    @Autowired
    private CategorieProdService categorieProdService;
    @PostMapping("/")
    public int save(@RequestBody CategorieProd categorieProd) {
        return categorieProdService.save(categorieProd);
    }
    @GetMapping("/code/{code}")
    public CategorieProd findByCode(@PathVariable String code) {
        return categorieProdService.findByCode(code);
    }
    @DeleteMapping("/code/{code}")
    @Transactional
    public int deleteByCode(@PathVariable String code) {
        return categorieProdService.deleteByCode(code);
    }
     @GetMapping("/")
    public List<CategorieProd> findAll() {
        return categorieProdService.findAll();
    }
}
