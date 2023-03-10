package com.example.projetBudget.bean;

import jakarta.persistence.*;

@Entity
public class AppelAchatProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ref;
    private double quantite;
    private double quantiteReception;
    private double quantiteLivraison;
    @ManyToOne
    private Produit produit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public double getQuantiteReception() {
        return quantiteReception;
    }

    public void setQuantiteReception(double quantiteReception) {
        this.quantiteReception = quantiteReception;
    }

    public double getQuantiteLivraison() {
        return quantiteLivraison;
    }

    public void setQuantiteLivraison(double quantiteLivraison) {
        this.quantiteLivraison = quantiteLivraison;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
}
