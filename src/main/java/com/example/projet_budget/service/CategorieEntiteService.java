package com.example.projet_budget.Service;

import com.example.projet_budget.Bean.CategorieEntite;
import com.example.projet_budget.Dao.CategorieEntiteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class CategorieEntiteService {
    @Autowired
    private CategorieEntiteDao categorieEntiteDao;

    public CategorieEntite findByCode(String code) {
        return categorieEntiteDao.findByCode(code);
    }
@Transactional
    public int deleteByCode(String code) {
        return categorieEntiteDao.deleteByCode(code);
    }

    public List<CategorieEntite> findByCategorieEntiteCode(String code) {
        return categorieEntiteDao.findByCategorieEntiteCode(code);
    }

    public   int save(CategorieEntite categorieEntite) {
         categorieEntiteDao.save(categorieEntite);
         return 1;
    }
}
