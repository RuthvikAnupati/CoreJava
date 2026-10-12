// 4 + 1 main
/*
Today's Assignment :

*Java*:-

1.Create a Class Named as LoanManagement with following 
*variables* 
customerName, LoanAmount, interestRate, Loantenure - in years

*Methods*
*calculateInterest()*
Accept loanAmount and interestRate as arguments.
Calculate and return the simple interest.

*calculateTotalAmount ()*
Accept the calculated interest as an argument.
Return the total amount payable.

*calculateMonthlyEMI()*:-
Accept the total payable amount and loan tenure as arguments.
Return the monthly EMI.

*displayLoanSummary()*:-
Accept the interest,
total amount, and EMI as arguments.

Display the complete loan details.
create atleast 2 different objects and different type of data 
and with every object call the method print the total in main with proper readability.
*/

package com.javafundamentals_lab;

import java.util.Scanner;

public class LoanManagement {

	Scanner sc = new Scanner(System.in);

	String custName = sc.nextLine();
	int loanAmount = sc.nextInt();
	double interestRate = sc.nextDouble();
	int tenure = sc.nextInt();

	public static void main(String[] args) {
		LoanManagement p1 = new LoanManagement();
		double result = p1.calculateInterest(p1.loanAmount, p1.interestRate);
		System.out.println(result);
		double totalAmount = p1.calculateTotalAmount();
		System.out.println(totalAmount);
		double emiPerMonth = p1.calculateMonthlyEMI();
		System.out.println(emiPerMonth);
		p1.displayLoanSummary();
	}

	double calculateInterest(int amount, double rate) {
		this.loanAmount = amount;
		this.interestRate = rate;
		double interest = (loanAmount * interestRate * tenure) / 100;
		return interest;
	}
	// PTR / 100
	double calculateTotalAmount() {
		double interetAmount = calculateInterest(loanAmount, interestRate);
		double TotalAmount = loanAmount + interetAmount;
		return TotalAmount;
	}
	// EMI = Total /(tenure*12);
	double calculateMonthlyEMI() {
		double totalAmount = calculateTotalAmount();
		double emi = totalAmount / (2 * 12);
		return emi;
	}

	void displayLoanSummary() {
		System.out.println("LOAN SUMMARY");
		System.out.println("Cust Name : " + custName);
		System.out.println("Loan Amouint : " + loanAmount);
		System.out.println("Interest Rate : " + interestRate);
		System.out.println("Tenure : " + tenure);
		System.out.println("Total Interest : " + calculateInterest(loanAmount, interestRate));
		System.out.println("Total Amount : " + calculateTotalAmount());
		System.out.println("EMI Per Month : " + calculateMonthlyEMI());
	}

}
