package com.example.projetBudget.ws;


import com.example.projetBudget.bean.AppelAchat;
import com.example.projetBudget.service.AppelAchatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appel-achat")
public class AppelAchatWs {
 @Autowired
   private AppelAchatService appelAchatService;
     @GetMapping("/ref/{ref}")
    public AppelAchat findByRef(@PathVariable String ref) {
        return appelAchatService.findByRef(ref);
    }
    @DeleteMapping("/ref/{ref}")
    @Transactional
    public int deleteByRef(@PathVariable String ref) {
        return appelAchatService.deleteByRef(ref);
    }
    @GetMapping("/")
    public List<AppelAchat> findAll() {
        return appelAchatService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody AppelAchat appelAchat) {
        return appelAchatService.save(appelAchat);
    }
}
