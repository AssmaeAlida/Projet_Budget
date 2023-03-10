package com.example.projetBudget.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private int annee;
    private double montantInvestissement ;
    private double montantFonctionnement ;
    private double montantTotal ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
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
