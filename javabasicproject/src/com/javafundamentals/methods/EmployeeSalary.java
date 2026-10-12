//8 + 1 main
package com.javafundamentals.methods;

import java.util.Scanner;

public class EmployeeSalary {

    Scanner sc = new Scanner(System.in);

    String getEmployeeName() {
        System.out.println("Enter Employee Name:");
        return sc.nextLine();
    }

    double getBasicSalary() {
        System.out.println("Enter Basic Salary:");
        return sc.nextDouble();
    }

    void displayEmployeeDetails(String name) {
        System.out.println("Employee Name: " + name);
    }

    double calculateHRA(double basicSalary) {
        return basicSalary * 0.20;
    }

    double calculateDA(double basicSalary) {
        return basicSalary * 0.10;
    }

    double calculateTotalSalary(double basicSalary, double hra, double da) {
        return basicSalary + hra + da;
    }

    void displaySalaryDetails(double basicSalary, double hra, double da, double totalSalary) {
        System.out.println("Basic Salary: Rs. " + basicSalary);
        System.out.println("HRA: Rs. " + hra);
        System.out.println("DA: Rs. " + da);
        System.out.println("Total Salary: Rs. " + totalSalary);
    }

    void displayWelcomeMessage() {
        System.out.println("Employee Salary Details");
    }

    public static void main(String[] args) {
        EmployeeSalary es = new EmployeeSalary();

        es.displayWelcomeMessage();

        String name = es.getEmployeeName();
        double basicSalary = es.getBasicSalary();

        double hra = es.calculateHRA(basicSalary);
        double da = es.calculateDA(basicSalary);
        double totalSalary = es.calculateTotalSalary(basicSalary, hra, da);

        es.displayEmployeeDetails(name);
        es.displaySalaryDetails(basicSalary, hra, da, totalSalary);
    }
}