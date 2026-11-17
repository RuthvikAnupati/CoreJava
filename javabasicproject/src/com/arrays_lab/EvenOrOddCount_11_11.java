package com.arrays_lab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOrOddCount_11_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int[] num = new int[size];
		int evenCount = 0;
		int oddCount = 0;

		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt();
			if(num[i]%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		System.out.println(Arrays.toString(num));
		System.out.println("Even Count : "+evenCount +" and "+ "Odd Count : "+oddCount);
		sc.close();
	}
}
