package com.exceptionHandling1;

import java.util.Scanner;

public class ExceptionHandling {
	
	String st;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter firstNumber ");
		int num1=sc.nextInt();

		System.out.println("Enter secondNumber ");
		int num2=sc.nextInt();
		
		//System.out.println("Answer "+num1/num2);
		
		String str = new String();
		System.out.println(str.length());
		
		//Arrays 
		
		ExceptionHandling exx = new ExceptionHandling();
		System.out.println(exx.st);
		
		
		try {
			int num=num1/num2;
			
		} finally {
			System.out.println("Sahise likho");
		}
	}

}
