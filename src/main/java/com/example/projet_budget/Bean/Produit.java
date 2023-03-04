package com.example.projet_budget.Bean;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;

    private String libelle;
    private String code;
    @ManyToOne
    private CategorieProduit categorieProduit;

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

    public CategorieProduit getCategorieProduit() {
        return categorieProduit;
    }

    public void setCategorieProduit(CategorieProduit categorieProduit) {
        this.categorieProduit = categorieProduit;
    }
}
