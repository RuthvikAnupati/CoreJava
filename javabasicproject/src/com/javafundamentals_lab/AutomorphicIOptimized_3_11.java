package com.javafundamentals_lab;

import java.util.Scanner;

public class AutomorphicIOptimized_3_11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int square = num * num;
        int temp = num;
        int count = 0;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        int divisor = (int) Math.pow(10, count);

        if (square % divisor == num) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not an Automorphic Number");
        }

        sc.close();
    }
}