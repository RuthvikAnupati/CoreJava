//1.check whether a number is positive or negative using Tenary Operator 
package com.javafundamentals_lab;

import java.util.Scanner;

public class PositiveOrNegative_Ternary_30_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		String result = (num > 0) ? "positive" : "negative";
		String res1 = (num > 0) ? "positive" : (num < 0) ? "negative" : "ZERO(0)";
		System.out.println(result);
		System.out.println(res1);
		sc.close();
	}

}
