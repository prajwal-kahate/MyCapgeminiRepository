package com.practice;

public class Extest {
	public Extest() {
		System.out.println("Constructor");
	}
	static {
		System.out.println("Static");
	}
	{
		System.out.println("Instace");
	}

	public static void main(String[] args) {
		/*
		int i = 10;
		int n=i++%5;
		int u =++i%5;
		System.out.println(i);
		System.out.println(n);
		System.out.println(u);
		*/
		byte num1 = 31;
		int num2 = 5;
		/*
		System.out.println(num1&num2);
		
		System.out.println(num1|num2);
		
		System.out.println(num1^num2);
		
		System.out.println(~num1);
		*/
		
		//System.out.println(num1>>2);
		Extest ex = new Extest();
		
		
	}

}
