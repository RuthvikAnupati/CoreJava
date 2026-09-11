package com.javaintro_lab;

public class Account_11_9 {
	
	int accNo;
	String name;
	int salary;
	
	static int accountGenerator = 1000;
	
	{
		accountGenerator++;
		accNo = accNo + accountGenerator;
	}
	
	

	public static void main(String[] args) {
		
		
		
		Account_11_9 a1 = new Account_11_9();
		Account_11_9 a2 = new Account_11_9();
		
		System.out.println(a1.accNo + ", "+ a2.accNo);
		
	}

}
