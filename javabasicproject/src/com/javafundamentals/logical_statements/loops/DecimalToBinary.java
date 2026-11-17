package com.javafundamentals.logical_statements.loops;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();

        int binary = 0;
        int position = 1;

        while (decimal > 0) {
            int rem = decimal % 2;
            binary = binary + rem * position;
            position = position * 10;
            decimal = decimal / 2;
        }
        System.out.println(binary);
        sc.close();
    }
}