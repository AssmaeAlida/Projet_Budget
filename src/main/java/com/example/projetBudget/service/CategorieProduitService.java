package com.example.projetBudget.service;

import com.example.projetBudget.bean.CategorieAppelAchat;
import com.example.projetBudget.bean.CategorieProduit;
import com.example.projetBudget.bean.Produit;
import com.example.projetBudget.dao.CategorieProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategorieProduitService {
    @Autowired
    private CategorieProduitDao categorieProduitDao;
    public int save(CategorieProduit categorieProduit) {
      categorieProduitDao.save(categorieProduit);
        return 1;
    }
    public CategorieProduit findByCode(String code) {
        return categorieProduitDao.findByCode(code);
    }
     @Transactional
    public int deleteByCode(String code) {
        return categorieProduitDao.deleteByCode(code);
    }

    public List<CategorieProduit> findAll() {
        return categorieProduitDao.findAll();
    }
}
