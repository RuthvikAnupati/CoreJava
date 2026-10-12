// 10 + 1 main
package com.javafundamentals_lab;

public class BugTracker_Methods_8_10 {

	Integer bugId;
	String applicationName;
	String bugTitle;
	String severity;
	Integer priority;
	String status;
	String assignedDeveloper;

	public static void main(String[] args) {

		BugTracker_Methods_8_10 bt1 = new BugTracker_Methods_8_10();

		// Initialize all values using object reference
		bt1.bugId = 1234;
		bt1.applicationName = "masthanbhai software solutions";
		bt1.bugTitle = "Exception Handling Error";
		bt1.severity = "Low";
		bt1.priority = 4;
		bt1.status = "Open";
		bt1.assignedDeveloper = "Mr.Jeevan";

		// Display initial bug details
		bt1.displayBugSummary();

		System.out.println("-------------------------------------");

		// Assign a new developer and automatically change status
		bt1.assignToDeveloper(1234, "ABC");

		// Display updated bug details
		bt1.displayBugSummary();

		System.out.println("-------------------------------------");

		// Update bug status manually
		bt1.updateStatus("Testing");

		// Display final bug details
		bt1.displayBugSummary();
	}

	// Getters
	public int getbugId() {
		return bugId;
	}

	public String getapplicationName() {
		return applicationName;
	}

	public String getbugTitle() {
		return bugTitle;
	}

	public String getseverity() {
		return severity;
	}

	public int getpriority() {
		return priority;
	}

	public String getstatus() {
		return status;
	}

	public String getassignedDeveloper() {
		return assignedDeveloper;
	}

	// Assign developer and change status
	public void assignToDeveloper(int bugId, String developerName) {

		if (this.bugId == bugId) {
			this.assignedDeveloper = developerName;
			this.status = "In Development";

			System.out.println("Bug ID: " + bugId);
			System.out.println("Developer Name: " + developerName);
			System.out.println("Status: " + status);
		} else {
			System.out.println("Bug ID not found!");
		}
	}

	// Update bug status
	public void updateStatus(String newStatus) {
		this.status = newStatus;
		System.out.println("Updated Status: " + status);
	}

	// Display all bug details using getter methods
	public void displayBugSummary() {

		System.out.println("------- Bug Summary -------");
		System.out.println("Bug ID: " + getbugId());
		System.out.println("Application Name: " + getapplicationName());
		System.out.println("Bug Title: " + getbugTitle());
		System.out.println("Severity: " + getseverity());
		System.out.println("Priority: " + getpriority());
		System.out.println("Status: " + getstatus());
		System.out.println("Assigned Developer: " + getassignedDeveloper());
	}
}
