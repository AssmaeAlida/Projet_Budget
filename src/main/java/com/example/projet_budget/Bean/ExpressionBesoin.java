package com.example.projet_budget.Bean;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class ExpressionBesoin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    @ManyToOne
    private BudgetEntite budgetEntite;
    private double total;
    private Date dateExpression;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BudgetEntite getBudgetEntite() {
        return budgetEntite;
    }

    public void setBudgetEntite(BudgetEntite budgetEntite) {
        this.budgetEntite = budgetEntite;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getDateExpression() {
        return dateExpression;
    }

    public void setDateExpression(Date dateExpression) {
        this.dateExpression = dateExpression;
    }
}
