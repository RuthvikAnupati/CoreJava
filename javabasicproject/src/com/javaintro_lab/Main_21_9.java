/*
Write a Java program to complete the following requirements:

a) Create 4 methods – 2 static and 2 instance methods. 
Write a statement inside each method to identify which method is called.

b) Call only one method inside main(), 
but the output should display statements from all 4 methods.
*/

package com.javaintro_lab;

public class Main_21_9 {
//	static Main_21_9 m = new Main_21_9();
	
	static void method1() {
		System.out.println("method1 is called");
		method2();
	}
	
	static void method2() {
		System.out.println("method2 is called");
		Main_21_9 m = new Main_21_9();
		m.method3();
	}
	
	void method3() {
		System.out.println("method3 is called");
		method4();
	}
	
	void method4() {
		System.out.println("method4 is called");
	}
	
	public static void main(String[] args) {
		System.out.println("main method is called");
		Main_21_9.method1();
		
	}

}
