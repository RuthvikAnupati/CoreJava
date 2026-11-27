/*
 * Write java program for product of array except self element of array 
 * Eg: arr={1,2,3,4,5}
 * Output : {120,60,40,30,24}
*/
package com.arrays;

import java.util.Arrays;

public class ProductOfArrayWithoutItself_Optimized {

	public static void main(String[] args) {

		int[] arr={1,2,3,4,5};
		int[] k = new int[arr.length];
		int res = 1;
		
		for(int i=0;i<arr.length;i++) {
			res = res * arr[i];
		}
		for(int i = 0;i<arr.length;i++) {
			k[i] = res/arr[i];
		}
		
		System.out.println(Arrays.toString(k));
	}

}
