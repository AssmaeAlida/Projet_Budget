package com.example.projet_budget.service;

import com.example.projet_budget.Bean.CategorieProd;
import com.example.projet_budget.Dao.CategorieProdDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategorieProdService {
    @Autowired
    private CategorieProdDao categorieProdDao;

    public int save(CategorieProd categorieProd){
        if (categorieProdDao.findByCode(categorieProd.getCode())!=null){
            return -1;
        }else{
            categorieProdDao.save(categorieProd);
            return 1;
        }
    }

    public CategorieProd findByCode(String code) {
        return categorieProdDao.findByCode(code);
    }
   @Transactional
    public int deleteByCode(String code) {
        return categorieProdDao.deleteByCode(code);
    }

    public List<CategorieProd> findAll() {
        return categorieProdDao.findAll();
    }
}
