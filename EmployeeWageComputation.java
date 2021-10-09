package com.bridgelabz;

public class EmployeeWageComputation {
	public static void main(String[] args) {

		//		constants for program
		double empCheck = Math.floor(Math.random() * 10) % 3;
		int isFullTime = 1;
		int isPartTime = 2;
		int wagePerHr = 20;
		int fullTimeWorkHr = 8;
		int partTimeWorkHr = 4;
	
		//	checking condition for full time and part time and calculating wage
	
		if (isFullTime == empCheck) {
			int salary = wagePerHr * fullTimeWorkHr;
			System.out.println("Wage per day is" + " " + salary);
		}		
		else if (empCheck == isPartTime) {
			int salary = wagePerHr * partTimeWorkHr;
			System.out.println(salary);
		}
		else {
			int salary = 0;
			System.out.println("As employee is absent wage is: " + salary);
		}
	}
}	