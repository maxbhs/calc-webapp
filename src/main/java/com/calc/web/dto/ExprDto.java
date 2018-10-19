package com.calc.web.dto;


public class ExprDto {
    private String expr;

    public ExprDto() {
    }

    public String getExpr() {
        return expr;
    }

    public void setExpr(String expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return expr;
    }
}
