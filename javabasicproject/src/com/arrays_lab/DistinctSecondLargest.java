/*
write java program to find second largest distinct element in array
eg: arr={2,7,13,9,8,13}
output : distinct second element is 9
*/
package com.arrays_lab;

public class DistinctSecondLargest {

	public static void main(String[] args) {
		int[] a = { 2, 7, 13, 9, 8, 13 };

		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				secMax = max;
				max = a[i];
			} else if (a[i] > secMax && a[i] != max) {
				secMax = a[i];
			}
		}
		System.out.println(secMax);
	}
}
