package com.bridgelabz;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		
	//constants for program
				
		int isEmployeePresent = 1;
//		getting 0 & 1 random value
		double empCheck = Math.floor(Math.random() * 10) % 2;
				
//		checking employee is present or not
				
		if (isEmployeePresent == empCheck) {
			System.out.println("Employee is Present");
				}
		else {
			System.out.println("Employee is absent");
		}
	}
}
