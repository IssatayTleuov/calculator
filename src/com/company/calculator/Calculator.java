package com.company.calculator;

public abstract class Calculator {
    private int firstNum;
    private int secondNum;
    private char operator;

    public Calculator(int firstNum, int secondNum, char operator) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.operator = operator;
    }

    public abstract int calculate();

    protected int getFirstNum() {
        return firstNum;
    }

    protected void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    protected int getSecondNum() {
        return secondNum;
    }

    protected void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }
}
