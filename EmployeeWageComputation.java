package com.bridgelabz;

public class EmployeeWageComputation {
	public static void main(String[] args) {
		
//		constants for program
		double empPresentAbsent = Math.floor(Math.random() * 10) % 3;
		long presentAbsent = (long)empPresentAbsent;
		int empCheck = (int)presentAbsent;
		int empWagePerHr =20; 
		
//		checking condition with switch case 
		
		switch(empCheck){
			case 1:
				int empFullTimeHr = 8;			
				int fullTimeEmpsalary = empWagePerHr * empFullTimeHr;
				System.out.println("Full Time salary: " +fullTimeEmpsalary);
				break;
			case 2:
				int empPartTimeHr = 4;
				int partTimeEmpsalary = empWagePerHr * empPartTimeHr;
				System.out.println("Part Time salary: " +partTimeEmpsalary);
				break;
			default:
				int salary = 0;
				System.out.println("As employee is absent , salary is : " +salary);
		}
	}
}