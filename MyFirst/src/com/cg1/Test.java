package com.cg1;

import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		/***
		Student st = new Student();
		st.setSrollno(1);
		st.setSname("Prajwal");
		st.setSub1(5);
		st.setSub2(6);
		st.setSub3(7);
		
		st.generateResult();
	
		
//		System.out.println("Enter Country:");
//		String country = sc.next();
//		
//		System.out.println("Enter Captain: ");
//		String captain = sc.next();
//		
//		System.out.println("Enter the Number of Matches: ");
//		int matches = sc.nextInt();
//		
//		Match match = new Match(country, captain, matches);
//		System.out.println(match);
		
		
		
		Book book = new Book();
		book.setBno(10);
		book.setTitle("Marathi");
		book.setAuthor("Kaka");
		book.setPrice(500);
		book.displayDetails();
		book.discountedPrice(5);
		
		
		
		Account account = new Account(11,"Manas",5000);
		System.out.println(account);
		
		System.out.println("Your Balance is "+account.getBal());
		
		
		account.withdraw(200);
		System.out.println("Your Balance is "+account.getBal());
		
		account.deposit(4000);
		System.out.println("Your Balance is "+account.getBal());
		
		
		
		Employee employee = new Employee(123,"Harsh",50000);
		System.out.println(employee.display());
		
		System.out.println("Enter bonus: ");
		int bonus = sc.nextInt();
		
		System.out.println("Enter da: ");
		int da = sc.nextInt();
		
		System.out.println("Enter hra: ");
		int hra = sc.nextInt();
		
		System.out.println("Enter tax%: ");
		int tax = sc.nextInt();
		
		System.out.println("Enter loan: ");
		int loan = sc.nextInt();
		
		System.out.println("Enter pf: ");
		int pf = sc.nextInt();
		
		
		employee.generateSalary(bonus, da, hra, tax, loan, pf);
	
		
		Vehicle vehicle = new Vehicle(212,"Alto",90000,25);
		
		Vehicle vehicle1 = new Vehicle(213,"Nano",100000,20);
		
		Vehicle vehicle2 = new Vehicle(214,"Creta",1000000,15);
		
		if (vehicle.getPrice()> vehicle1.getPrice()) {
			System.out.println("Lower Price Car is "+vehicle1);
		}else {
			System.out.println("Lower Price Car is "+vehicle);
		}
		
		
		if(vehicle.getMileage()>vehicle1.getMileage() && vehicle.getMileage()>vehicle2.getMileage())
		{
			System.out.println(vehicle);
		}else if(vehicle1.getMileage()>vehicle2.getMileage())
		{
			System.out.println(vehicle1);
		}else {
			System.out.println(vehicle2);
		}
		
		
		Complex complex = new Complex(5,3);
		System.out.println(complex.printComplex());
		*/
		
		
		
	}
}
