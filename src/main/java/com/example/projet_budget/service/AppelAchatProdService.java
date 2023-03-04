package com.example.projet_budget.Service;

import com.example.projet_budget.Dao.AppelAchatProdDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AppelAchatProdService {
    @Autowired
    private AppelAchatProdDao appelAchatProdDao;


    public AppelAchatProd findByRef(String ref) {
        return appelAchatProdDao.findByRef(ref);
    }

    public List<AppelAchatProd> findByAppelAchatProdRef(String ref) {
        return appelAchatProdDao.findByAppelAchatProdRef(ref);
    }
    @Transactional

    public int deleteByRef(String ref) {
        return appelAchatProdDao.deleteByRef(ref);
    }

    public int save(AppelAchatProd appelAchatProd) {
        if (findByAppelAchatProdRef(appelAchatProd.getRef())!=null){
            return -1;

        } else if (appelAchatProd.getProduit().getCode()==null) {
            return -2;
        } else {
            appelAchatProdDao.save(appelAchatProd);
            return 1;
        }

    }
}

