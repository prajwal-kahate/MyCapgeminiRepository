package com.Lab5.ExceptionHandling;

public class Employee {
	private String firstName;
	private String lastName;
	public Employee(String firstName, String lastName) throws NameException {
		super();
		if (firstName.isBlank() && lastName.isBlank()) {
			throw new NameException("Your First name and Last name is blank");
		} else {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) throws NameException {
		if (firstName==null) {
			throw new NameException("Your First name and Last name is blank");
		} else {
			this.firstName = firstName;
		}
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) throws NameException {
		if (lastName.isBlank()) {
			throw new NameException("Your First name and Last name is blank");
		} else {
			this.lastName = lastName;
		}
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	
}
