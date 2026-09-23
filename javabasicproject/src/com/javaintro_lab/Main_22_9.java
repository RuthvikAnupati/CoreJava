/*
Write a Java program that defines 5 methods (3 static and 2 instance methods) and 
demonstrate what happens when these methods are not invoked from the main() method.
but invoked  all 5 methods

*/

package com.javaintro_lab;

public class Main_22_9 {
    
    
	static Main_22_9 m = new Main_22_9();
	
    static {
    	method1();
    }
	
	static void method1() {
		System.out.println("method1 is called");
		method2();
	}
	
	static void method2() {
		System.out.println("method2 is called");
		method3();
	}
	
	static void method3() {
		System.out.println("method3 is called");
		
		m.method4();
	}
	
	void method4() {
		System.out.println("method4 is called");
		method5();
	}
	
	void method5() {
		System.out.println("method5 is called");
	}
	
	public static void main(String[] args) {
		System.out.println("main method is called");
		
	}

}
