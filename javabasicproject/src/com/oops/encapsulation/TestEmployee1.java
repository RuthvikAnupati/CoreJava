package com.oops.encapsulation;

public class TestEmployee1 {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1();
		System.out.println("*********DEFAULT VALUES***********");
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		System.out.println(e1.getPassword());
		
		System.out.println("*********E1***********");
		
		e1.setId(123);
		e1.setName("Ruthvik");
		e1.setSalary(10000);
		e1.setPassword("NOTHING@123");
		
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		System.out.println(e1.getPassword());
		
		System.out.println("*********E2***********");
		
		Employee1 e2 = new Employee1();
		
		e2.setId(987);
		e2.setName("Pandu");
		e2.setSalary(15000);
		e2.setPassword("NOTHING@987");
		
		System.out.println(e2.getId());
		System.out.println(e2.getName());
		System.out.println(e2.getSalary());
		System.out.println(e2.getPassword());
		
		System.out.println("*********E3***********");
		Employee1 e3 = new Employee1(456 , "Noone" , 32000 , "NOTHING@456");
		System.out.println(e3);
	}

}
