package com.example.projet_budget.Bean;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class AppelAchat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private Date DateAppelAchat;
    private double totale;
    @ManyToOne
    private CategorieAppelAchat categorieAppelAchat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateAppelAchat() {
        return DateAppelAchat;
    }

    public void setDateAppelAchat(Date dateAppelAchat) {
        DateAppelAchat = dateAppelAchat;
    }

    public double getTotale() {
        return totale;
    }

    public void setTotale(double totale) {
        this.totale = totale;
    }

    public CategorieAppelAchat getCategorieAppelAchat() {
        return categorieAppelAchat;
    }

    public void setCategorieAppelAchat(CategorieAppelAchat categorieAppelAchat) {
        this.categorieAppelAchat = categorieAppelAchat;
    }
}
