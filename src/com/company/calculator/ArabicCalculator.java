package com.company.calculator;

public class ArabicCalculator extends Calculator {

    public ArabicCalculator(int firstNum, int secondNum, char operator) {
        super(firstNum, secondNum, operator);
    }

    @Override
    public int calculate() {
        int result = 0;

        if (getFirstNum() >= 1 && getFirstNum() <= 10 && getSecondNum() >= 1 && getSecondNum() <= 10) {
            switch (getOperator()) {
                case '+':
                    result = getFirstNum() + getSecondNum();
                    break;
                case '-':
                    result = getFirstNum() - getSecondNum();
                    break;
                case '*':
                    result = getFirstNum() * getSecondNum();
                    break;
                case '/':
                    result = getFirstNum() / getSecondNum();
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
        }
        return result;
    }
}
