package com.wchy.demo.basedao.dto;

import java.io.Serializable;

public class Account implements Serializable {

    private static final long serialVersionUID = -5542722246696087945L;

    private String idType;
    private String idNo;
    private String userName;
    private String mobile;

    public Account() {
    }

    public Account(String idType, String idNo, String userName, String mobile) {
        this.idType = idType;
        this.idNo = idNo;
        this.userName = userName;
        this.mobile = mobile;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Account{" +
                "idType='" + idType + '\'' +
                ", idNo='" + idNo + '\'' +
                ", userName='" + userName + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
