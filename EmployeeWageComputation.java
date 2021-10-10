package com.bridgelabz;

public class EmployeeWageComputation {
	public static void main(String[] args) {
		// introducing variable as a constant
		final int isPartTime = 1;
		final int isFullTime = 2;
		final int empRatePerHr = 20;
		final int noOfWorkDays = 20;
		final int maxHrPerMonth = 100;

		// initializing variable
		int empHrs = 0;
		int	totalEmpWage = 0;
		int	totalEmpHrs = 0;
		int	totalWorkingDays = 0;
		// computation
		while (totalEmpHrs <= maxHrPerMonth && totalWorkingDays < noOfWorkDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case isFullTime:
				empHrs = 8;
				break;
			case isPartTime:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println(" Day: " + totalWorkingDays);
			System.out.println(" Dailly Employee Hour: " + empHrs);
			System.out.println(" Total Employee hour: " + totalEmpHrs);
			System.out.println(" ");

		}
		totalEmpWage = totalEmpHrs * empRatePerHr;
		System.out.println(" Employee Wages For a Month: " + totalEmpWage);

	}
}
