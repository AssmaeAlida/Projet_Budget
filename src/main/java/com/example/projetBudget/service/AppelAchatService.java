package com.example.projetBudget.Service;

import com.example.projetBudget.bean.AppelAchat;
import com.example.projetBudget.dao.AppelAchatDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AppelAchatService {
    @Autowired
    private AppelAchatDao appelAchatDao;

    public AppelAchat findByRef(String ref) {
        return appelAchatDao.findByRef(ref);
    }
@Transactional
    public int deleteByRef(String ref) {
        return appelAchatDao.deleteByRef(ref);
    }

    public int  save ( AppelAchat appelAchat) {
        if(findByRef(appelAchat.getRef())!=null){
            return -1;
        } else if (appelAchat.getCategorieAppelAchat().getCode()==null) {
                return -2;
        } else if (appelAchat.getAppelAchatProduit().getRef()==null) {
            return -3;

        } else {
            appelAchatDao.save(appelAchat);
            return 1;
        }

    }
}
