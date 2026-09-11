/*
 Java :-

Task: Create a Java class Institute with the following requirements:
Declare a static variable TrainerName1.
Declare a static variable TrainerName2.
Declare an instance variable Employee Name, EmployeetId, EmployeeDesignation.
Assign values to both variables.
Create an  5 object of the Institute class.

 */

package com.javaintro_lab;

public class Institute_8_9 {

	static String trainerName1 = "RUTHVIK";
	static String trainerName2 = "RAJ";
	
	String empName;
	int empId;
	String empDesg;
	
	public static void main(String[] args) {
		
		System.out.println(Institute_8_9.trainerName1 +" "+trainerName2);
		
		Institute_8_9  v =new Institute_8_9();
		v.empName = "Vinod";
		v.empId = 1;
		v.empDesg = "AsstProf";
		
		System.out.println(v.empName+" "+v.empId+" "+v.empDesg);
		
		Institute_8_9  m =new Institute_8_9();
		m.empName = "Moulali";
		m.empId = 2;
		m.empDesg = "AsstProf";
		
		System.out.println(m.empName+" "+m.empId+" "+m.empDesg);
		
		Institute_8_9  p =new Institute_8_9();
		p.empName = "Puneet";
		p.empId = 3;
		p.empDesg = "Prof";
		
		System.out.println(p.empName+" "+p.empId+" "+p.empDesg);
		
		Institute_8_9  c =new Institute_8_9();
		c.empName = "Chandu";
		c.empId = 4;
		c.empDesg = "Sr.AsstProf";
		
		System.out.println(c.empName+" "+c.empId+" "+c.empDesg);
		
		Institute_8_9  a =new Institute_8_9();
		a.empName = "Abhi";
		a.empId = 5;
		a.empDesg = "Sr.Prof";
		
		System.out.println(a.empName+" "+a.empId+" "+a.empDesg);

	}

}
