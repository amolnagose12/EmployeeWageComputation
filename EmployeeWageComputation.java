package com.bridgelabz;

public class EmployeeWageComputation {
	public static void main(String[] args) {

//		constants for program
		int isPresent = 1;
		int wagePerHr = 20;
		int fullDayWorkHr = 8;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		
//		checking condition for attendence and calculating wage
		
		if (isPresent == empCheck) {
			int salary = wagePerHr * fullDayWorkHr;
			System.out.println("Wage per day is" + " " + salary);
		}
		else {
			int salary = 0;
			System.out.println("As employee is absent wage is: " + salary);
		}
	}	
}
