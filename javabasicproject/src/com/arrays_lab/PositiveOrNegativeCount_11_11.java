package com.arrays_lab;

import java.util.Arrays;
import java.util.Scanner;

public class PositiveOrNegativeCount_11_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int[] num = new int[size];
		int posCount = 0;
		int negCount = 0;

		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt();
			if (num[i] > 0) {
				posCount++;
			} else {
				negCount++;
			}
		}
		System.out.println(Arrays.toString(num));
		System.out.println("Positive Count : " + posCount + " and " + "Negative Count : " + negCount);
		sc.close();
	}
}
