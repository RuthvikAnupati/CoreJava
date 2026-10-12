// 4 + 1 main
package com.javafundamentals.methods;

import java.util.Scanner;

//WAP to find Areas of Triangle, Circle, Square & Rectangle 
//Triangle : 0.5 * base * height 
//Circle  : PI * r * r 
//Square : side * side 
//Rectangle : length * breadth 

public class FindAreas {

	public static void main(String[] args) {
		FindAreas ar = new FindAreas();

		Scanner s = new Scanner(System.in);

		System.out.println("------Finding Areas------");
		System.out.println("Enter Base : ");
		double base = s.nextDouble();

		System.out.println("Enter Height : ");
		double height = s.nextDouble();

		double aot = ar.findAreaOfTri(base, height);
		System.out.println("Area of Triangle : " + aot);
		System.out.println("-------------------------------------");

		System.out.println("Enter Radius : ");
		double radius = s.nextDouble();

		double aoc = ar.findAreaOfCir(radius);
		System.out.println("Area of Circle : " + aoc);
		System.out.println("-------------------------------------");

		System.out.println("Enter Side : ");
		double side = s.nextDouble();

		double aos = ar.findAreaOfSq(side);
		System.out.println("Area of Square : " + aos);
		System.out.println("-------------------------------------");

		System.out.println("Enter Length : ");
		double length = s.nextDouble();

		System.out.println("Enter Breadth : ");
		double breadth = s.nextDouble();

		double aor = ar.findAreaOfRect(length, breadth);
		System.out.println("Area of Rectangle : " + aor);

		s.close();

	}

	double findAreaOfTri(double b, double h) {
		double aot = 0.5 * b * h;
		return aot;
	}

	double findAreaOfCir(double r) {
		double aoc = Math.PI * r * r;
		return aoc;
	}

	double findAreaOfSq(double s) {
		double aos = s * s;
		return aos;
	}

	double findAreaOfRect(double l, double b) {
		double aor = (l * b);
		return aor;
	}

}