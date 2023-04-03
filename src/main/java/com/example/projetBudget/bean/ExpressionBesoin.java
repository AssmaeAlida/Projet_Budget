package com.example.projetBudget.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;


@Entity
public class ExpressionBesoin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    @ManyToOne
    private BudgetEntiteAdministratif budgetEntiteAdministratif;
    private double total;
    private String code;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date dateExpressionBesoin ;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "expressionBesoin")
    private List<ExpressionBesoinProduit> expressionBesoinProduitList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public BudgetEntiteAdministratif getBudgetEntiteAdministratif() {
        return budgetEntiteAdministratif;
    }

    public void setBudgetEntiteAdministratif(BudgetEntiteAdministratif budgetEntiteAdministratif) {
        this.budgetEntiteAdministratif = budgetEntiteAdministratif;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDateExpressionBesoin() {
        return dateExpressionBesoin;
    }

    public void setDateExpressionBesoin(Date dateExpressionBesoin) {
        this.dateExpressionBesoin = dateExpressionBesoin;
    }

    public List<ExpressionBesoinProduit> getExpressionBesoinProduitList() {
        return expressionBesoinProduitList;
    }

    public void setExpressionBesoinProduitList(List<ExpressionBesoinProduit> expressionBesoinProduitList) {
        this.expressionBesoinProduitList = expressionBesoinProduitList;
    }
}
