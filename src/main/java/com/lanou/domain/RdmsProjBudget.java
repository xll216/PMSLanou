package com.lanou.domain;

import java.math.BigDecimal;


/**
 * 预算明细的卡片
 **/
public class RdmsProjBudget {
    private String budDetailId;//预算明细标识

    private String busiTable;//业务表

    private String busiId;//业务标识 项目基本标识=业务标识 外健

    private String budgetType;//预算类型

    private BigDecimal budgetFee;//预算费用

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

    @Override
    public String toString() {
        return "RdmsProjBudget{" +
                "budDetailId='" + budDetailId + '\'' +
                ", busiTable='" + busiTable + '\'' +
                ", busiId='" + busiId + '\'' +
                ", budgetType='" + budgetType + '\'' +
                ", budgetFee=" + budgetFee +
                '}';
    }
}