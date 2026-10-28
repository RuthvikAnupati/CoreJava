package com.javafundamentals.constructors;

public class Test {


	Test() {
		System.out.println("Constructor Called");
	}
	
	{
		System.out.println("Instance Block Called");
	}

	public static void main(String[] args) {
		Test test = new Test();
		
		//Instance Block is called First When We Create Object
	}

}
