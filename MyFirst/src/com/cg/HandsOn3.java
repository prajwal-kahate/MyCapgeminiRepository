package com.cg;

public class HandsOn3 {

	public static void main(String[] args) {

		HandsOn3 ex = new HandsOn3();
		ex.isPrime();
		ex.isPalindrome();

	}

	public void isPrime() {
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
	
	
	
	//Write a Java program to find if the given number is palindrome or not
	
	public void isPalindrome()
	{
		int num = 214;
		int num1;
		int fvalue=0;
		int result=num;
		
		
		while(num>0) 
		{
			num1 = num%10;
			fvalue = (fvalue*10)+num1;
			num = num/10;
			
		}
		
		if(result == fvalue)
		{
			System.out.println(result+"is a palindrome");
		}
		else {
			System.out.println(fvalue+" is not a palindrome");
		}
		
		
		
	}
	

	
	

}
