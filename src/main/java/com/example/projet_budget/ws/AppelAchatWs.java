package com.example.projet_budget.Ws;

import com.example.projet_budget.Bean.AppelAchat;
import com.example.projet_budget.Service.AppelAchatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/appel-achat")
public class AppelAchatWs {
 @Autowired
    private AppelAchatService appelAchatService;

    @GetMapping("/ref/{ref}")
    public AppelAchat findByRef(@PathVariable String ref) {
        return appelAchatService.findByRef(ref);
    }
    @DeleteMapping ("/ref/{ref}")
    @Transactional
    public int deleteByRef(@PathVariable String ref) {
        return appelAchatService.deleteByRef(ref);
    }
    @PostMapping ("/")
    public int save(@RequestBody AppelAchat appelAchat) {
        return appelAchatService.save(appelAchat);
    }
}
