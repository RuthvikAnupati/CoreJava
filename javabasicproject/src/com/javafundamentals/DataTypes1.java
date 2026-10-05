package com.javafundamentals;

public class DataTypes1 {

	static Integer num;
	public static void main(String[] args) {
		System.out.println(num); 
//		default it gives null for Wrapper Data Types
//		Integer num1 ;
//		System.out.println(num1); // The local variable num1 may not have been initialized
//		We cannot just declare variables in local along with that we also need to initialize it.
//		so we declared in class level as in class we can just declare variables.
		
		int num1 = 24;
	    char char1 = 'M';
	    int n3 = (char)char1;
//	    char c1 = (int)num1;
	    System.out.println(n3);
//	    System.out.println(c1);
		
	}

}
