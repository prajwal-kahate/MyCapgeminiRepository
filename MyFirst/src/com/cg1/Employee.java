package com.cg1;

public class Employee 
{
	private int empId;
	private String empName;
	private int basicPay;
	
	
	public Employee(int empId, String empName, int basicPay) {
		this.empId = empId;
		this.empName = empName;
		this.basicPay = basicPay;
	}
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(int basicPay) {
		this.basicPay = basicPay;
	}


	public String display() {
		return "Employee Id:" + empId + "\nEmployee Name: " + empName + " \nBasic Pay: " + basicPay;
	}
	
	public void generateSalary(int bonus,int da,int hra,int tax1,int loan,int pf)
	{
		int gross = basicPay+bonus+da+hra;
		System.out.println("Gross is: "+gross);
		
		int tax= (basicPay/100)*tax1;
		System.out.println(tax);
		
		int ded = tax+loan+pf;
		System.out.println("Ded is: "+ ded);
		
		int netsal = gross-ded;
		System.out.println("Net Salary is Rs: "+netsal);
		
	}
	
	
	

}
