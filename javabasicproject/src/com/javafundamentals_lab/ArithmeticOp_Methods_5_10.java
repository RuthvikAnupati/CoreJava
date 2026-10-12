//4 + 1 main
package com.javafundamentals_lab;

public class ArithmeticOp_Methods_5_10 {

    int add(int n1, int n2) {
        return n1 + n2;
    }

    int sub(int n1, int n2) {
        return n1 - n2;
    }

    int mul(int n1, int n2) {
        return n1 * n2;
    }

    int div(int n1, int n2) {
        if (n2 == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return n1 / n2;
    }

    public static void main(String[] args) {

        ArithmeticOp_Methods_5_10 aop =
                new ArithmeticOp_Methods_5_10();

        System.out.println("Addition: " + aop.add(45, 34));
        System.out.println("Subtraction: " + aop.sub(33, 4));
        System.out.println("Multiplication: " + aop.mul(34, 12));
        System.out.println("Division: " + aop.div(55, 11));
    }
}
