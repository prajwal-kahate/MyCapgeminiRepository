package com.employeeSalary;

class PermanentEmployee extends Employee {
	private String designation;
	private double hikePercent;
	
	public double calculateSal;
	
	
	public PermanentEmployee(int employeeId, String employeeName, double baseSalary) {
		super(employeeId, employeeName, baseSalary);
	}


	public PermanentEmployee(int employeeId, String employeeName, double baseSalary, String designation,
			double hikePercent) {
		super(employeeId, employeeName, baseSalary);
		this.designation = designation;
		this.hikePercent = hikePercent;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public double getHikePercent() {
		return hikePercent;
	}


	public void setHikePercent(double hikePercent) {
		this.hikePercent = hikePercent;
	}
	
	public String calculateSalaryHike() {
		
		calculateSal = getBaseSalary() + (hikePercent/100)*getBaseSalary();
		return "Total salary is Rs "+calculateSal+" /-";

    }

	
	

}