//8 + 1 MAIN
package com.javafundamentals.methods;

import java.util.Scanner;

public class StudentAttendance {

    Scanner sc = new Scanner(System.in);

    String getStudentName() {
        System.out.println("Enter Student Name:");
        return sc.nextLine();
    }

    int getTotalClasses() {
        System.out.println("Enter Total Classes:");
        return sc.nextInt();
    }

    int getAttendedClasses() {
        System.out.println("Enter Attended Classes:");
        return sc.nextInt();
    }

    double calculateAttendance(int attended, int total) {
        return (double) attended / total * 100;
    }

    void displayStudentDetails(String name) {
        System.out.println("Student Name: " + name);
    }

    void displayClassDetails(int total, int attended) {
        System.out.println("Total Classes: " + total);
        System.out.println("Attended Classes: " + attended);
    }

    void displayAttendance(double percentage) {
        System.out.println("Attendance Percentage: " + percentage + "%");
    }

    void displayMessage() {
        System.out.println("Student Attendance Details");
    }

    public static void main(String[] args) {
        StudentAttendance sa = new StudentAttendance();

        sa.displayMessage();

        String name = sa.getStudentName();
        int total = sa.getTotalClasses();
        int attended = sa.getAttendedClasses();

        double percentage = sa.calculateAttendance(attended, total);

        sa.displayStudentDetails(name);
        sa.displayClassDetails(total, attended);
        sa.displayAttendance(percentage);
    }
}