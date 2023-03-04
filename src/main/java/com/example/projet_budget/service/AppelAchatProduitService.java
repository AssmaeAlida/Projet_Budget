package com.example.projet_budget.Service;

import com.example.projet_budget.Bean.AppelAchatProduit;
import com.example.projet_budget.Dao.AppelAchatProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AppelAchatProduitService {
    @Autowired
    private AppelAchatProduitDao appelAchatProduitDao;


    public AppelAchatProduit findByRef(String ref) {
        return appelAchatProduitDao.findByRef(ref);
    }

    @Transactional

    public int deleteByRef(String ref) {
        return appelAchatProduitDao.deleteByRef(ref);
    }

    public int save(AppelAchatProduit appelAchatProduit) {
        if (appelAchatProduit.getRef()!=null){
            return -1;

        } else if (appelAchatProduit.getProduit().getCode()==null) {
            return -2;
        } else {
            appelAchatProduitDao.save(appelAchatProduit);
            return 1;
        }

    }
}

