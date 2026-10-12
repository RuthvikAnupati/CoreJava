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

    String customerName;
    double loanAmount;
    double interestRate;
    int loanTenure;

    Scanner sc = new Scanner(System.in);

    void getLoanDetails() {
        System.out.println("Enter Customer Name:");
        customerName = sc.nextLine();

        System.out.println("Enter Loan Amount:");
        loanAmount = sc.nextDouble();

        System.out.println("Enter Interest Rate:");
        interestRate = sc.nextDouble();

        System.out.println("Enter Loan Tenure in Years:");
        loanTenure = sc.nextInt();

        sc.nextLine();
    }

    double calculateInterest(double loanAmount, double interestRate) {
        return (loanAmount * interestRate * loanTenure) / 100;
    }

    double calculateTotalAmount(double interest) {
        return loanAmount + interest;
    }

    double calculateMonthlyEMI(double totalAmount, int tenure) {
        return totalAmount / (tenure * 12);
    }

    void displayLoanSummary(double interest, double totalAmount, double emi) {
        System.out.println("\n----- LOAN SUMMARY -----");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Loan Amount: Rs. " + loanAmount);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Loan Tenure: " + loanTenure + " years");
        System.out.println("Total Interest: Rs. " + interest);
        System.out.println("Total Amount: Rs. " + totalAmount);
        System.out.println("Monthly EMI: Rs. " + emi);
    }

    public static void main(String[] args) {
        LoanManagement p1 = new LoanManagement();

        System.out.println("Enter Details for Customer 1");
        p1.getLoanDetails();

        double interest1 = p1.calculateInterest(p1.loanAmount, p1.interestRate);
        double total1 = p1.calculateTotalAmount(interest1);
        double emi1 = p1.calculateMonthlyEMI(total1, p1.loanTenure);

        p1.displayLoanSummary(interest1, total1, emi1);

        LoanManagement p2 = new LoanManagement();

        System.out.println("\nEnter Details for Customer 2");
        p2.getLoanDetails();

        double interest2 = p2.calculateInterest(p2.loanAmount, p2.interestRate);
        double total2 = p2.calculateTotalAmount(interest2);
        double emi2 = p2.calculateMonthlyEMI(total2, p2.loanTenure);

        p2.displayLoanSummary(interest2, total2, emi2);

        p1.sc.close();
    }
}