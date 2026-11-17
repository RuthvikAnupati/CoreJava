package com.arrays_lab;

import java.util.Arrays;

public class MoveZerosToEndBySwapping {

	public static void main(String[] args) {
		int[] arr = {1, 0, 3, 2, 0, 9, 0, 8, 0, 7};

        int num = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[num];
                arr[num] = temp;

                num++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
