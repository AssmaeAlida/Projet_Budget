package com.example.projetBudget.bean;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class CategorieProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String libelle;
    private String code;
    private BigDecimal prix;

    public BigDecimal getPrix() {
        return prix;
    }
    @ManyToOne
    private Produit produit;

    public void setPrix(BigDecimal prix) {
        this.prix = prix;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
}

