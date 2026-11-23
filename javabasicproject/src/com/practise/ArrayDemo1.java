package com.practise;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("-------------");

		for (int a : arr) {
			System.out.print(a + " ");
		}
		sc.close();
	}

}
