package com.example.projetBudget.bean;

import jakarta.persistence.*;

@Entity
public class BudgetEntiteAdministratif {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String ref;

    @ManyToOne
    private EntiteAdministratif entiteAdministratif;
    @ManyToOne
    private Budget budget;
    private double montantInvestissement ;
    private double montantFonctionnement ;
    private double montantTotal ;
    @ManyToOne
    private CategorieEntiteAdministratif categorieEntiteAdministratif;

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

    public EntiteAdministratif getEntiteAdministratif() {
        return entiteAdministratif;
    }

    public void setEntiteAdministratif(EntiteAdministratif entiteAdministratif) {
        this.entiteAdministratif = entiteAdministratif;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public double getMontantInvestissement() {
        return montantInvestissement;
    }

    public void setMontantInvestissement(double montantInvestissement) {
        this.montantInvestissement = montantInvestissement;
    }

    public double getMontantFonctionnement() {
        return montantFonctionnement;
    }

    public void setMontantFonctionnement(double montantFonctionnement) {
        this.montantFonctionnement = montantFonctionnement;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }

    public CategorieEntiteAdministratif getCategorieEntiteAdministratif() {
        return categorieEntiteAdministratif;
    }

    public void setCategorieEntiteAdministratif(CategorieEntiteAdministratif categorieEntiteAdministratif) {
        this.categorieEntiteAdministratif = categorieEntiteAdministratif;
    }
}
