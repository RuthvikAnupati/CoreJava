/*
* Task: Create a Java program using void methods to perform the following operations:
* Create a method displayStudentDetails() to display student name, roll number, and course.
* Create a method calculateTotal() to calculate and display the total of 3 subject marks.
* Create a method calculateAverage() to calculate and display the average marks.
* Display student details, Call all methods.
*/

package com.javafundamentals_lab;

public class Student_Methods_2_10 {
	
	String name;
	int roll_Num;
	String course;
	
	int mark1;
	int mark2;
	int mark3;
	
	void displayStudentDetails(String name, int roll_Num , String course) {
		this.name = name ;
		this.roll_Num = roll_Num ;
		this.course = course;
		System.out.println(name);
		System.out.println(roll_Num);
		System.out.println(course);
	}
	
	void caluculateTotal(int m1 , int m2 , int m3) {
		this.mark1 = m1;
		this.mark2 = m2;
		this.mark3 = m3;
		System.out.println(mark1);
		System.out.println(mark2);
		System.out.println(mark3);
		
	}
	
	void calculateAverage() {
		
	}
	

	public static void main(String[] args) {
		
		Student_Methods_2_10 s1 = new Student_Methods_2_10();

		s1.displayStudentDetails("Ruthvik", 7101, "JAVA");
		
		s1.caluculateTotal(98, 100, 89);
		
	}

}
