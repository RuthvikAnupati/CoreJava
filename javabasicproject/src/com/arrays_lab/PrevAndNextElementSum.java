package com.arrays_lab;

import java.util.Arrays;

public class PrevAndNextElementSum {
	public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (i == 0) {

                result[i] = arr[i] + arr[i + 1];

            } else if (i == arr.length - 1) {

                result[i] = arr[i - 1] + arr[i];

            } else {

                result[i] = arr[i - 1] + arr[i + 1];
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
