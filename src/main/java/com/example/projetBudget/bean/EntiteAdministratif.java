package com.example.projetBudget.bean;

import jakarta.persistence.*;

@Entity
public class EntiteAdministratif {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libelle;
    private String code;
    @ManyToOne
    private CategorieEntiteAdministratif categorieEntiteAdministratif;

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

    public CategorieEntiteAdministratif getCategorieEntiteAdministratif() {
        return categorieEntiteAdministratif;
    }

    public void setCategorieEntiteAdministratif(CategorieEntiteAdministratif categorieEntiteAdministratif) {
        this.categorieEntiteAdministratif = categorieEntiteAdministratif;
    }
}
