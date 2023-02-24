package com.example.projet_budget.Bean;

import jakarta.persistence.*;

@Entity
public class AppelAchatProd {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    @ManyToOne
    private Produit produit;
    private int qte;
    private int qteReception;
    private int qteLivraison;
    @ManyToOne
    private AppelAchat appelAchat;

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

    public AppelAchat getAppelAchat() {
        return appelAchat;
    }

    public void setAppelAchat(AppelAchat appelAchat) {
        this.appelAchat = appelAchat;
    }
}
