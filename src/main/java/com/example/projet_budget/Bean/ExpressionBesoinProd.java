package com.example.projet_budget.Bean;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class ExpressionBesoinProd {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
   @ManyToOne
    private Produit produit ;
    private int qte;
    private String code;
    private int qteAccordee;
    private int qteDemandee;
    private int qteReception;
    private int qteLivraison;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public int getQteAccordee() {
        return qteAccordee;
    }

    public void setQteAccordee(int qteAccordee) {
        this.qteAccordee = qteAccordee;
    }

    public int getQteDemandee() {
        return qteDemandee;
    }

    public void setQteDemandee(int qteDemandee) {
        this.qteDemandee = qteDemandee;
    }

    public int getQteReception() {
        return qteReception;
    }

    public void setQteReception(int qteReception) {
        this.qteReception = qteReception;
    }

    public int getQteLivraison() {
        return qteLivraison;
    }

    public void setQteLivraison(int qteLivraison) {
        this.qteLivraison = qteLivraison;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
