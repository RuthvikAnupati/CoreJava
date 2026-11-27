
package com.arrays_lab;

import java.util.Arrays;
import java.util.Scanner;

/*Write a Java program to read N integers into an array and count the positive, negative, and zero elements separately.
 * Input:
 * 6
 * 10 -5 0 20 -8 0
 * 
 * Output:
 * Array: [10, -5, 0, 20, -8, 0]
 * Positive Count: 2
 * Negative Count: 2
 * Zero Count: 2
*/
public class PositiveOrNegativeCount_11_11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] num = new int[size];

        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < size; i++) {

            num[i] = sc.nextInt();

            if (num[i] > 0) {
                posCount++;
            } else if (num[i] < 0) {
                negCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println(Arrays.toString(num));

        System.out.println("Positive Count : " + posCount);
        System.out.println("Negative Count : " + negCount);
        System.out.println("Zero Count : " + zeroCount);

        sc.close();
    }
}
