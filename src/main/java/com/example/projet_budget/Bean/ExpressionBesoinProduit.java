package com.example.projet_budget.Bean;

import jakarta.persistence.*;

@Entity
public class ExpressionBesoinProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Produit produit;
    @ManyToOne
    private ExpressionBesoin expressionBesoin;
    private double quantite;
    private String code;
    private double quantiteAccordee;
    private double quantiteDemandee;
    private double quantiteReception;
    private double quantiteLivraison;

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

    public ExpressionBesoin getExpressionBesoin() {
        return expressionBesoin;
    }

    public void setExpressionBesoin(ExpressionBesoin expressionBesoin) {
        this.expressionBesoin = expressionBesoin;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getQuantiteAccordee() {
        return quantiteAccordee;
    }

    public void setQuantiteAccordee(double quantiteAccordee) {
        this.quantiteAccordee = quantiteAccordee;
    }

    public double getQuantiteDemandee() {
        return quantiteDemandee;
    }

    public void setQuantiteDemandee(double quantiteDemandee) {
        this.quantiteDemandee = quantiteDemandee;
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
}
