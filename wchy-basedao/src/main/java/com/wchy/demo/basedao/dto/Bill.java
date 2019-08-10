package com.wchy.demo.basedao.dto;

import java.io.Serializable;

public class Bill implements Serializable {

    private static final long serialVersionUID = 8549637512550483996L;

    private String isHousehold;
    private String bankId;
    private String pan;
    private String surplus;
    private String dueDate;
    private String repayAmt;

    public Bill() {
    }

    public Bill(String isHousehold, String bankId, String pan, String surplus, String dueDate, String repayAmt) {
        this.isHousehold = isHousehold;
        this.bankId = bankId;
        this.pan = pan;
        this.surplus = surplus;
        this.dueDate = dueDate;
        this.repayAmt = repayAmt;
    }

    public String getIsHousehold() {
        return isHousehold;
    }

    public void setIsHousehold(String isHousehold) {
        this.isHousehold = isHousehold;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getSurplus() {
        return surplus;
    }

    public void setSurplus(String surplus) {
        this.surplus = surplus;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getRepayAmt() {
        return repayAmt;
    }

    public void setRepayAmt(String repayAmt) {
        this.repayAmt = repayAmt;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "isHousehold='" + isHousehold + '\'' +
                ", bankId='" + bankId + '\'' +
                ", pan='" + pan + '\'' +
                ", surplus='" + surplus + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", repayAmt='" + repayAmt + '\'' +
                '}';
    }
}
