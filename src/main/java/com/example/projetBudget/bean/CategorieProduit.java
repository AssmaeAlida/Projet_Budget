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

}

