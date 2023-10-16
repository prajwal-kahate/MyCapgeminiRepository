package com.cg;

public class PrimeNumber {

	public static void main(String[] args) {
		boolean flag = true;
		int num = 5;
		
		if (num == 0 || num == 1) {
			System.out.println(num+" Neither prime nor Composite");
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}

			}

		}
		if (flag == false) {
			System.out.println(num+" is Not a prime number");
		} else {
			System.out.println(num+" is a prime number");
		}

	}

}
