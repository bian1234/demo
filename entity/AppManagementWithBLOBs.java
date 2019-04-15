package com.hld.entity;

public class AppManagementWithBLOBs extends AppManagement {
    private String yytbbase64;

    private String yyjtbase64;

    public String getYytbbase64() {
        return yytbbase64;
    }

    public void setYytbbase64(String yytbbase64) {
        this.yytbbase64 = yytbbase64 == null ? null : yytbbase64.trim();
    }

    public String getYyjtbase64() {
        return yyjtbase64;
    }

    public void setYyjtbase64(String yyjtbase64) {
        this.yyjtbase64 = yyjtbase64 == null ? null : yyjtbase64.trim();
    }
}