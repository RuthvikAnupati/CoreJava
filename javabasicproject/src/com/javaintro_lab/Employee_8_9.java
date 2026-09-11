package com.javaintro_lab;

public class Employee_8_9 {
	
	int empId;
	String empName;
	int salary;
	
	static String companyName;
	
	static {
		companyName = "VIT";
		System.out.println("Static Block Executed");
	}
	
	{
		System.out.println("Instance Block Executed");
	}
	
	public static void main(String[] args) {
		Employee_8_9 e1 = new Employee_8_9();
		e1.empId = 1;
		e1.empName = "Ruthvik";
		e1.salary = 10000;
		
		System.out.println(e1.empId +" "+e1.empName +" "+e1.salary);
		
		Employee_8_9 e2 = new Employee_8_9();
		e2.empId = 2;
		e2.empName = "Vinod";
		e2.salary = 1000;
		
		System.out.println(e2.empId +" "+e2.empName +" "+e2.salary);
		
		Employee_8_9 e3 = new Employee_8_9();
		e3.empId = 3;
		e3.empName = "Puneeth";
		e3.salary = 18000;
		
		System.out.println(e3.empId +" "+e3.empName +" "+e3.salary);
	}

}
