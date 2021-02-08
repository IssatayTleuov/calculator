package com.company.calculator;

public class RomanCalculator extends Calculator {

    public RomanCalculator(int firstNum, int secondNum, char operator) {
        super(firstNum, secondNum, operator);
    }

    @Override
    public int calculate() {
        int result = 0;

        if (getFirstNum() != 0 && getSecondNum() != 0) {
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

    public String convert(int number) {
        if (number != 0) {
        String romanOnes = romanDigit( number%10, "I", "V", "X");
        number /=10;
        String romanTens = romanDigit( number%10, "X", "L", "C");
        number /=10;
        String romanHundreds = romanDigit(number%10, "C", "D", "M");
        number /=10;
        String romanThousands = romanDigit(number%10, "M", "", "");

            return romanThousands + romanHundreds + romanTens + romanOnes;
        }
        return "Error!";
    }

    public String romanDigit(int n, String one, String five, String ten){
        if(n >= 1) {
            if(n == 1) {
                return one;
            } else if (n == 2) {
                return one + one;
            } else if (n == 3) {
                return one + one + one;
            } else if (n==4) {
                return one + five;
            } else if (n == 5) {
                return five;
            } else if (n == 6) {
                return five + one;
            } else if (n == 7) {
                return five + one + one;
            } else if (n == 8) {
                return five + one + one + one;
            } else if (n == 9) {
                return one + ten;
            }

        }
        return "";
    }
}

