package com.javaintroduction;

public class Memory1 {
	static int collegeId;
	static String collegeName;

	int stdId;
	String stdName;

	public static void main(String[] args) {
		
		collegeId = 10;
		collegeName = "VIT";
		
		System.out.println(collegeId);
		System.out.println(collegeName);
		
		Memory1 a = new Memory1();
		a.stdId = 1;
		System.out.println(a.stdId);
		
	}

}
