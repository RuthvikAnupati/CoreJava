/*
1. Create a Java program to store the following student details using Wrapper Classes only:
* Student ID → Integer
* Student Name → String
* Age → Integer
* Marks → Double
* Grade → Character
* Passed → Boolean
Display all student details.
2.Create a Java program to:
* Convert int → double.
* Convert double → int.
* Convert char → int.
* Convert int → char.
Display all converted values.*/

package com.javafundamentals_lab;

public class DataTypes2_30_9 {

	
	public static void main(String[] args) {
		Integer student_Id = 7101;
		System.out.println("Student Id : "+student_Id);
		
		String name = "Ruthvik";
		System.out.println("Name : "+name);
		
		Integer age = 23;
		System.out.println("Age : "+age);
		
		Double marks = 8.7;
		System.out.println("Marks : "+marks);
		
		Character grade = 'A';
		System.out.println("Grade : "+grade);
		
		Boolean passed = true;
		System.out.println("Passed : "+ passed);
		
	    System.out.println("------------------------------------------");
	    
	    //We cannot do typecasting like this for WRAPPER DATA TYPES
	    double d1 = (int)age;
	    System.out.println(d1);
	    
//	    int n1 = (int)marks; //Cannot cast from Double to int
	    System.out.println("int n1 = (int)marks ::: Cannot cast from Double to int");
	    
	    int n2 = (int)grade;
	    System.out.println(n2);
	    
	    System.out.println("------------------------------------------");
	    
	    int num1 = 45;
	    double d2 = 8.67;
	    char c1 = 'M';
	    
	    System.out.println("Int : "+num1);
	    System.out.println("Double : "+d2);
	    System.out.println("Char : "+c1);
	    
	    double i2d = (double)num1;
	    System.out.println("Int to Double : "+i2d);
	    
	    int d2i = (int)d2;
	    System.out.println("Double to Int : "+d2i);
	    
	    int c2i = (int)c1;
	    System.out.println("Char to Int : "+c2i);
	    
	    char i2c = (char)num1;
	    System.out.println("Int to Char : "+i2c);
	    
	}
}
