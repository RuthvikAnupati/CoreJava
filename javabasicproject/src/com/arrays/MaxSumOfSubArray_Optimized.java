// O(n)
package com.arrays;

public class MaxSumOfSubArray_Optimized {

	public static void main(String[] args) {

		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		int currentSum = 0;
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			currentSum += nums[i];
			maxSum = Math.max(maxSum, currentSum);

			if (currentSum < 0) {
				currentSum = 0;
			}
		}
		System.out.println(maxSum);
	}

}
