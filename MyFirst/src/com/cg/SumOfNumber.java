package com.cg;

public class SumOfNumber {

	public static void main(String[] args) {
		int num = 1234;
		int num1;
		int result=0;
		while(num>0) 
		{
			num1 = num%10;
			result = result + num1;
			num = num/10;
		}
		System.out.println(result);
	}

}
