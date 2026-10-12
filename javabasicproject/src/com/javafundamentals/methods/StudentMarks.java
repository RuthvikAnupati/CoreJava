//6 + 1 main
package com.javafundamentals.methods;

import java.util.Scanner;

public class StudentMarks {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StudentMarks s1 = new StudentMarks();
		s1.displayResults();
	}

	double firstYearGPA() {
		System.out.println("Enter 1.1 GPA : ");
		double sem1 = sc.nextDouble();
		System.out.println("Enter 1.2 GPA : ");
		double sem2 = sc.nextDouble();
		double Y1 = sem1 + sem2;
		return Y1 / 2;
	}

	double secondYearGPA() {
		System.out.println("Enter 2.1 GPA : ");
		double sem1 = sc.nextDouble();
		System.out.println("Enter 2.2 GPA : ");
		double sem2 = sc.nextDouble();
		double Y2 = sem1 + sem2;
		return Y2 / 2;
	}

	double thirdYearGPA() {
		System.out.println("Enter 3.1 GPA : ");
		double sem1 = sc.nextDouble();
		System.out.println("Enter 3.2 GPA : ");
		double sem2 = sc.nextDouble();
		double Y3 = sem1 + sem2;
		return Y3 / 2;
	}

	double fourthYearGPA() {
		System.out.println("Enter 4.1 GPA : ");
		double sem1 = sc.nextDouble();
		System.out.println("Enter 4.2 GPA : ");
		double sem2 = sc.nextDouble();
		double Y4 = sem1 + sem2;
		return Y4 / 2;
	}

	double overallCGPA(double y1, double y2, double y3, double y4) {
		double cgpa = (y1 + y2 + y3 + y4) / 4;
		return cgpa;
	}

	void displayResults() {
		double year1 = firstYearGPA();
		double year2 = secondYearGPA();
		double year3 = thirdYearGPA();
		double year4 = fourthYearGPA();

		double cgpa = overallCGPA(year1, year2, year3, year4);

		System.out.println("Year 1 CGPA : " + year1);
		System.out.println("Year 2 CGPA : " + year2);
		System.out.println("Year 3 CGPA : " + year3);
		System.out.println("Year 4 CGPA : " + year4);
		System.out.println("Overall CGPA : " + cgpa);
	}
}
