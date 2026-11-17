/*
Write java program to moves all zero to end
eg: arr={1,0,3,2,0,9,0,8,0,7}
output: {1,3,2,9,7,0,0,0,0}
*/

package com.arrays_lab;

import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 3, 2, 0, 9, 0, 8, 0, 7 };

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
		System.out.println(Arrays.toString(arr));
	}
}
