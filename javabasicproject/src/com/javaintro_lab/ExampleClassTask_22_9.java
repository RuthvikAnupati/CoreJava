package com.javaintro_lab;

public class ExampleClassTask_22_9 {
	
	static int A = m1();
	
	static {
		System.out.println("hello");
	}
	
	static int m1() {
		System.out.println("m1");
		return 0;
	}
	
	static {
		System.out.println("Hello2");
	}

	public static void main(String[] args) {
		System.out.println("main");
	}

}
