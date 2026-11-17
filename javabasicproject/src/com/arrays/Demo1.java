package com.arrays;

public class Demo1 {

	public static void main(String[] args) {
		int[] num = new int[5];
		num[0] = 45;
		num[1] = 34;
		num[2] = 62;
		num[3] = 18;
		num[4] = 78;

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		System.out.println("-------------");
		for (int n : num) {
			System.out.println(n);
		}
	}
}
