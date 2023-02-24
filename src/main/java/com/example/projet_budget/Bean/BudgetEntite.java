package com.example.projet_budget.Bean;

import jakarta.persistence.*;

@Entity
public class BudgetEntite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    @ManyToOne
    private EntiteAdministratif entiteAdministratif;
    @ManyToOne
    private Budget budget;
    private double montantInvestissement ;
    private double montantFonctionnement ;
    private double montantTotal ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
