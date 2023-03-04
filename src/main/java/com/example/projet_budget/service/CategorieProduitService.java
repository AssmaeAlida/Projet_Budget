package com.example.projet_budget.service;

import com.example.projet_budget.Bean.CategorieProduit;
import com.example.projet_budget.Dao.CategorieProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategorieProduitService {
    @Autowired
    private CategorieProduitDao categorieProduitDao;

    public int save(CategorieProduit categorieProduit) {
        if (categorieProduitDao.findByCode(categorieProduit.getCode()) != null) {
            return -1;
        } else {
            categorieProduitDao.save(categorieProduit);
            return 1;
        }
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