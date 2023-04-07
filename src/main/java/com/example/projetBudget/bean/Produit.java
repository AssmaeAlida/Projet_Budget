package com.example.projetBudget.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;

    private String libelle;
    private String code;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "produit")
    private List<CategorieProduit >categorieProduits;

    public List<CategorieProduit> getCategorieProduits(){
        return categorieProduits;
    }

    public void setCategorieProduits(List<CategorieProduit> categorieProduits) {
        this.categorieProduits = categorieProduits;
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

}
