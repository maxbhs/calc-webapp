package com.calc.web.dto;

public class CalculationResultDto {

    private String expr;
    private String result;

    public CalculationResultDto() {
    }

    public CalculationResultDto(String expr, String result) {
        this.expr = expr;
        this.result = result;
    }

    public String getExpr() {
        return expr;
    }

    public void setExpr(String expr) {
        this.expr = expr;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "CalculationResultDto{" +
                "expr='" + expr + '\'' +
		", result=" + result +
                '}';
    }
}
