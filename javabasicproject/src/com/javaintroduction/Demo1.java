package com.javaintroduction;

public class Demo1 {

	static {
		System.out.println("Static Class Loaded");
	}

	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("Main Method loaded");
		
		Class.forName("java.lang.String");
	}
}