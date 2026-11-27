/*
 * Create an encapsulated class Employee with private fields: id, name, salary, password.
 * Requirements:
 * I. Make all fields private (Data Hiding).
 * II. Create public setters and getters.
 * III. Access and modify the data
*/

package com.oops.encapsulation;

public class Employee1 {
	private int id;
	private String name;
	private int salary;
	private String password;

	public String toString() {
		return "Employee1 [ id = " + id + " , name = " + name + " , salary = " + salary + " , password = " + password + " ]";
	}

	public Employee1() {
	}

	public Employee1(int id, String name, int salary, String password) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.password = password;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
