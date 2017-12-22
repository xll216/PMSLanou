package com.lanou.domain;

import java.math.BigDecimal;

public class RdmsProjBudget {
    private String budDetailId;

    private String busiTable;

    private String busiId;

    private String budgetType;

    private BigDecimal budgetFee;

    public RdmsProjBudget(String budDetailId, String busiTable, String busiId, String budgetType, BigDecimal budgetFee) {
        this.budDetailId = budDetailId;
        this.busiTable = busiTable;
        this.busiId = busiId;
        this.budgetType = budgetType;
        this.budgetFee = budgetFee;
    }

    public RdmsProjBudget() {
        super();
    }

    public String getBudDetailId() {
        return budDetailId;
    }

    public void setBudDetailId(String budDetailId) {
        this.budDetailId = budDetailId == null ? null : budDetailId.trim();
    }

    public String getBusiTable() {
        return busiTable;
    }

    public void setBusiTable(String busiTable) {
        this.busiTable = busiTable == null ? null : busiTable.trim();
    }

    public String getBusiId() {
        return busiId;
    }

    public void setBusiId(String busiId) {
        this.busiId = busiId == null ? null : busiId.trim();
    }

    public String getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(String budgetType) {
        this.budgetType = budgetType == null ? null : budgetType.trim();
    }

    public BigDecimal getBudgetFee() {
        return budgetFee;
    }

    public void setBudgetFee(BigDecimal budgetFee) {
        this.budgetFee = budgetFee;
    }
}