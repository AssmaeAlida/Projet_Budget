package com.example.projet_budget.Bean;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class AppelAchat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String ref;
    private Date dateAppelAchat;
    private double totale;
    @ManyToOne
    private CategorieAppelAchat categorieAppelAchat;
    @ManyToOne
    private AppelAchatProduit appelAchatProduit;



    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateAppelAchat() {
        return dateAppelAchat;
    }

    public void setDateAppelAchat(Date dateAppelAchat) {
        dateAppelAchat = dateAppelAchat;
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

    public AppelAchatProduit getAppelAchatProduit() {
        return appelAchatProduit;
    }

    public void setAppelAchatProduit(AppelAchatProduit appelAchatProduit) {
        this.appelAchatProduit = appelAchatProduit;
    }
}
