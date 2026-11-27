package com.arrays_lab;

public class MissingElements {
	public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 5};

        boolean[] present = new boolean[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {

            present[arr[i]] = true;
        }

        for (int i = 0; i < present.length; i++) {

            if (present[i] == false) {

                System.out.println("Missing Element: " + i);
                break;
            }
        }
    }
}
