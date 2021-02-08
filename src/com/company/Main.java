package com.company;

import com.company.calculator.ArabicCalculator;
import com.company.calculator.RomanCalculator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        char n = array[1].charAt(0);

        try {
            int firstNum = Integer.parseInt(array[0]);
            int secondNum = Integer.parseInt(array[2]);
            ArabicCalculator arabicCalculator = new ArabicCalculator(firstNum, secondNum, n);
            int result = arabicCalculator.calculate();
            System.out.println(result);
        } catch (Exception e) {
            int firstNum = 0;
            int secondNum = 0;
            String[] romanNumbers = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};

            for (int i = 0; i < romanNumbers.length; i++) {
                if (array[0].equals(romanNumbers[i]) && array[2].equals(romanNumbers[i])) {
                    firstNum = i + 1;
                    secondNum = i + 1;
                } else if (array[0].equals(romanNumbers[i])) {
                    firstNum = i + 1;
                } else if (array[2].equals(romanNumbers[i])) {
                    secondNum = i + 1;
                }
            }
            RomanCalculator romanCalculator = new RomanCalculator(firstNum, secondNum, n);
            int result = romanCalculator.calculate();
            String answer = romanCalculator.convert(result);
            System.out.println(answer);
        }
    }
}
