package com.example.projetBudget.bean;

import jakarta.persistence.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.Date;
import java.util.List;

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
    @OneToMany(mappedBy = "appelAchat")
    private List<AppelAchatProduit> appelAchatProduits;


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

    public Date getDateAppelAchat() {
        return dateAppelAchat;
    }

    public void setDateAppelAchat(Date dateAppelAchat) {
        this.dateAppelAchat = dateAppelAchat;
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

    public List<AppelAchatProduit> getAppelAchatProduits() {
        return appelAchatProduits;
    }

    public void setAppelAchatProduits(List<AppelAchatProduit> appelAchatProduits) {
        this.appelAchatProduits = appelAchatProduits;
    }
}
