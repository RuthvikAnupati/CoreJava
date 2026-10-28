package com.javafundamentals.logical_statements;

import java.util.Scanner;

public class Calculator_Switch_28_10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int a = sc.nextInt();

		System.out.println("Enter b Number : ");
		int b = sc.nextInt();

		System.out.println("Enter a symbol : ");
		char symb = sc.next().charAt(0);

		int result = 0;

		switch (symb) {
		case '+' -> result = a + b;
		case '-' -> result = a - b;
		case '*' -> result = a * b;
		case '/' -> result = a / b;
		case '%' -> result = a % b;
		default -> result = 0;
		}
		System.out.println(result);
		sc.close();
	}

}
