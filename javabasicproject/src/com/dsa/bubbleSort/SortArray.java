package com.dsa.bubbleSort;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = { 9, 4, 7, 2, 6, 1 };

		int temp = 0;

		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr));
	}

}
