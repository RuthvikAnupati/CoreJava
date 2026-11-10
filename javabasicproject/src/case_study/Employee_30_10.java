/*
Write a Java program to create an Employee class with id, name, and salary. 
Initialize the values using a parameterized constructor and 
create methods to calculate a 10% bonus and 
display the employee details including the final salary.
 */
package case_study;

import java.util.Scanner;

public class Employee_30_10 {

	int id;
	String name;
	int salary;
	int bonusSal;
	int finalSal;

	public Employee_30_10(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void salBonus() {
		bonusSal = salary * 10 / 100;
		finalSal = bonusSal + salary;
	}

	void display() {
		System.out.println("---Employee Salary Details---");
		System.out.println("EmployeeId : " + id);
		System.out.println("EmployeeName : " + name);
		System.out.println("Salary : " + salary);
		System.out.println("Bonus Increment : " + bonusSal);
		System.out.println("Final Salary : " + finalSal);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter EmpId : ");
		int id = sc.nextInt();

		System.out.print("Enter EmpName : ");
		String name = sc.next();

		System.out.print("Enter EmpSal : ");
		int sal = sc.nextInt();

		Employee_30_10 e1 = new Employee_30_10(id, name, sal);
		e1.salBonus();
		e1.display();

		sc.close();
	}
}
