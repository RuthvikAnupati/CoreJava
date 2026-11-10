package com.javafundamentals.logical_statements.loops;

import java.util.Scanner;

public class Automorphic_9_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int temp = num;
		int count = 0;

		while (num > 0) {
			count++;
			num = num / 10;
		}
		int square = temp * temp; // 625
		System.out.println(square);
		int temp1 = 0;
		int temp2 = 0;
		int place = 1;

		for (int i = 0; i < count; i++) {

			temp1 = square % 10;

			temp2 = temp2 + temp1 * place;

			place = place * 10;

			square = square / 10;

			System.out.println(temp2);
		}
		if (temp2 == temp) {
			System.out.println("Automorphic Number");
		} else {
			System.out.println("Not Automorphic Number");
		}
		sc.close();
	}

}
