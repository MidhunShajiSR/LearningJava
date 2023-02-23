package com.canddella.assignment;

public class SalaryCalculator {

	public static void main(String[] args) {
		
		int basicSalary = 8000;
		int dearnessAllowance = 4000;
		int houseRentAllowance = 3000;
		int providentFund = 1500;
		float totalSalary = (basicSalary+dearnessAllowance+houseRentAllowance)-providentFund;
		System.out.println("Total Salary : "+ totalSalary);
	}

}
