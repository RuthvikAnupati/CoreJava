
package com.javafundamentals.logical_statements;

import java.util.Scanner;

public class CalculatorWithDoWhile_Switch_28_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String yn;

        do {
            System.out.print("Enter Num1: ");
            int num1 = sc.nextInt();

            System.out.print("Enter Num2: ");
            int num2 = sc.nextInt();

            System.out.print("Enter a Symbol {+, -, *, /, %}: ");
            char symbol = sc.next().charAt(0);

            int result = 0;

            switch (symbol) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero!");
                        break;
                    }
                    result = num1 / num2;
                    break;

                case '%':
                    if (num2 == 0) {
                        System.out.println("Cannot perform modulo by zero!");
                        break;
                    }
                    result = num1 % num2;
                    break;

                default:
                    System.out.println("Invalid operator!");
                    break;
            }

            if ("+-*".indexOf(symbol) >= 0
                    || (symbol == '/' && num2 != 0)
                    || (symbol == '%' && num2 != 0)) {
                System.out.println("Result: " + result);
            }

            System.out.println("Do you have more calculations to do? (Y/N)");
            yn = sc.next();

        } while (yn.equalsIgnoreCase("Y"));

        System.out.println("Calculation closed!");

        sc.close();
    }
}
