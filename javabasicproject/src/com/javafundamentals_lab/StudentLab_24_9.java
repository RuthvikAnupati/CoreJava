/*
Create a Student class using:

	Static Block – Print college name.
	Instance Block – Print Student object created.
	Instance Method – Display student details.
	Static Method – Display college details.
	Create 2 Student objects in main() and call all methods.
	Student fields: rollNo, name, marks.
*/

package com.javafundamentals_lab;

public class StudentLab_24_9 {
	
	int id;
	String studName;
	int marks;
	
	static {
		String collegeName = "VIT";
		System.out.println(collegeName);
		
	}
	
	{
		System.out.println("Student Object Created!");
		
	}
	
	void studentDisplay() {
		System.out.println("Id - "+ id);
		System.out.println("Name - "+studName);
		System.out.println("Marks - "+marks);
	}
	
	static void collegeDetails() {
		System.out.println("VIT");
	}
	public static void main(String[] args) {
		
		collegeDetails();
		
		StudentLab_24_9 s1 = new StudentLab_24_9();
		s1.id = 1;
		s1.studName = "Ruthvik";
		s1.marks = 80;
		
		s1.studentDisplay();
		
		StudentLab_24_9 s2 = new StudentLab_24_9();
		s2.id = 2;
		s2.studName = "Vinod";
		s2.marks = 89;
		
		s2.studentDisplay();
	}

}
