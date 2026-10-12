// 3 + 1 main
package com.javafundamentals_lab;

public class Student_Methods_2_10 {

	String name;
	int roll_Num;
	String course;

	int mark1;
	int mark2;
	int mark3;
	int total;

	void displayStudentDetails(String name, int roll_Num, String course) {
		this.name = name;
		this.roll_Num = roll_Num;
		this.course = course;

		System.out.println("Student Details: " + this.name);
		System.out.println("Student Num: " + this.roll_Num);
		System.out.println("Student Course: " + this.course);
	}

	void calculateTotal(int m1, int m2, int m3) {
		this.mark1 = m1;
		this.mark2 = m2;
		this.mark3 = m3;

		System.out.println("Marks 1: " + mark1);
		System.out.println("Marks 2: " + mark2);
		System.out.println("Marks 3: " + mark3);

		total = mark1 + mark2 + mark3;

		System.out.println("Total Marks: " + total);
	}

	void calculateAverage() {
		double avg = total / 3.0;
		System.out.println("Average: " + avg);
	}

	public static void main(String[] args) {
		
		Student_Methods_2_10 s1 = new Student_Methods_2_10();

		s1.displayStudentDetails("Ruthvik", 7101, "JAVA");

		s1.calculateTotal(98, 100, 89);

		s1.calculateAverage();
	}
}
