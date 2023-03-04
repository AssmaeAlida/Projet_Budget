package com.example.projet_budget.Bean;

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

    public CategorieEntiteAdministratif getCategorieEntite() {
        return categorieEntiteAdministratif;
    }

    public void setCategorieEntite(CategorieEntiteAdministratif categorieEntiteAdministratif) {
        this.categorieEntiteAdministratif = categorieEntiteAdministratif;
    }
}
