/*
 * Write java program for product of array except self element of array 
 * Eg: arr={1,2,3,4,5}
 * Output : {120,60,40,30,24}
*/
package com.arrays_lab;

import java.util.Arrays;

public class ProductOfArrayWithoutItself {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		int[] k = new int[arr.length];
		
//		BRUTE - FORCE - O(n2)
		for(int i =0;i<arr.length;i++) {
			int res = 1 ;
			for(int j=0;j<arr.length ; j++) {
				if(i!=j) {
					res = res*arr[j];
				}
			}
			k[i]= res; 
		}
		System.out.println(Arrays.toString(k));
	}
}
