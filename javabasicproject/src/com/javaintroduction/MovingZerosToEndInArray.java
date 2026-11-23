package com.javaintroduction;

import java.util.Arrays;

public class MovingZerosToEndInArray {

	public static void main(String[] args) {
		int[] arr = { 5, 0, 3, 13, 0, 2, 0, 133, 56, 43 };

		int num = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[num] = arr[i];
				num++;
			}
		}
		while (num < arr.length) {
			arr[num] = 0;
			num++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println(Arrays.toString(arr));
	}
}