package com.employeeSalary;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee ID: ");
		int employeeId = sc.nextInt();

		System.out.println("Enter Employee Name: ");
		String employeeName = sc.next();

		System.out.println("Enter Employee Base Salary: ");
		double baseSalary = sc.nextDouble();
		
		
		boolean flag = true;

		while (flag){
			System.out.println();
			System.out.println("Are you Permanent Employee or Temporary Employee \nIf Permanent write 1 and If Temporary write 2 \nand If you want to exit then write 0: \n ");
			int num = sc.nextInt();
			if (num == 0) {
				System.out.println("Thank you...");
				flag = false;
			}
			else if (num == 1) {

				System.out.println("Enter Employee Designation: ");
				String designation = sc.next();

				System.out.println("Enter Employee HikePercent: ");
				double hikePercent = sc.nextDouble();

				PermanentEmployee permentEmployee = new PermanentEmployee(employeeId, employeeName, baseSalary,
						designation, hikePercent);
				System.out.println(permentEmployee.calculateSalaryHike());
				flag = true;

			} else if (num == 2) {

				System.out.println("Enter Employee Service Period: ");
				double servicePeriod = sc.nextDouble();

				TemporaryEmployee temporaryEmployee = new TemporaryEmployee(employeeId, employeeName, baseSalary,
						servicePeriod);
				System.out.println(temporaryEmployee.calculateSalaryHike());
				flag = true;
				
			}
		} 
		*/
		Employee emp = new Employee(123,"rahul", 30);
		System.out.println(emp);
		
		Employee emp1 = new Employee(111,"harsh",30000);
		System.out.println(emp1);
	}
}
