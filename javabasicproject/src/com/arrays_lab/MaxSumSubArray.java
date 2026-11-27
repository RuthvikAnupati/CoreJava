/* Write java program for Finding maxsubArray sum 
 * Eg:int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
 * Output : 6
*/
// O(n2)

package com.arrays_lab;

public class MaxSumSubArray {

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum += nums[j];
				maxSum = Math.max(maxSum, sum);
			}
		}
		System.out.println(maxSum);
	}

}
