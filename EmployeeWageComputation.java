package com.bridgelabz;

public class EmployeeWageComputation {
	public static void main(String[] args) {
		
//		constants for program
		int isFullTime = 1;
		int isPartTime = 2;
		int wagePerHr = 20;
		int fullTimeWorkHr = 8;
		int partTimeWorkHr = 4;
		int noOfWorkingDays = 20;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		
//		calculating wage for each day		
		for (int day = 1; day <= noOfWorkingDays; day++) {
			if (isFullTime == empCheck) {
				int salary = wagePerHr * fullTimeWorkHr;
				System.out.println("Salary of Fulltime employee" + " " + salary);
			}
			else if(empCheck == isPartTime){
				int salary = wagePerHr * partTimeWorkHr;
				System.out.println("Salary Of Part time Employee " +" "+ salary);
			}
			else {
				int salary = 0;
				System.out.println("As employee is absent salary: " +salary);
			}
		}
	}
}
