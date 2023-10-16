package com.employeeSalary;

class TemporaryEmployee extends Employee {
	private double servicePeriod;
	
	public double calculateSal;
	


	public TemporaryEmployee(int employeeId, String employeeName, double baseSalary) {
		super(employeeId, employeeName, baseSalary);
	}



	public TemporaryEmployee(int employeeId, String employeeName, double baseSalary, double servicePeriod) 
	{
		super(employeeId, employeeName, baseSalary);
		this.servicePeriod = servicePeriod;
	}

	



	public double getServicePeriod() {
		return servicePeriod;
	}



	public void setServicePeriod(double servicePeriod) {
		this.servicePeriod = servicePeriod;
	}




	public String calculateSalaryHike() {
		//calculateSal = servicePeriod*(super.getBaseSalary() + ((10/100)*super.getBaseSalary()));
		
	
		calculateSal= servicePeriod*(super.getBaseSalary()+(10*super.getBaseSalary()/100));
		return "Total salary is Rs "+calculateSal+" /-";

	}

}
