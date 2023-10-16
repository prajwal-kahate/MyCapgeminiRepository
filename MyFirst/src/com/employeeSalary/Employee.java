package com.employeeSalary;
class Employee {
	private int employeeId;
	private String employeeName;
	private double baseSalary;
	
	
	
	public Employee(int employeeId, String employeeName, double baseSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.baseSalary = baseSalary;
	}
	public Employee() {
		super();
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", baseSalary=" + baseSalary
				+ "]";
	}
	
	
	
	
	

 

}
