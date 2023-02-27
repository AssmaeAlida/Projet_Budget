package com.example.projet_budget.Service;


import com.example.projet_budget.Bean.CategorieAppelAchat;
import com.example.projet_budget.Dao.CategorieAppelAchatDao;
import com.example.projet_budget.Dao.CategorieEntiteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategorieAppelAchatService {
    @Autowired
    private CategorieAppelAchatDao categorieAppelAchatDao;

    public CategorieAppelAchat findByCode(String code) {
        return categorieAppelAchatDao.findByCode(code);
    }
@Transactional
    public int deleteByCode(String code) {
        return categorieAppelAchatDao.deleteByCode(code);
    }

    public int save(CategorieAppelAchat categorieAppelAchat) {
       categorieAppelAchatDao.save(categorieAppelAchat);
       return 1;
    }
}
