package com.string;

import java.util.Arrays;
import java.util.*;

public class StringDemo {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		
		/**
		// find the sum of all the digits 
		
		String str="1234";
		int sum=0;
		
		for (int i = 0; i < str.length(); i++) {
			String ss =""+str.charAt(i);
			sum=sum+ Integer.parseInt(ss);
		}
		System.out.println(sum);
		
		
        

		// 2. String str="30;32;50;26;70";
        // find the sum of all the digits where 2 exist
		
		String str1="30;32;50;26;70;";
		String[] s1= str1.split(";");
		int result=0;
		
		for (int i = 0; i < s1.length; i++) {
			String string = s1[i];
			
			if (string.contains("2")) {
				String[] s2= {string};
				for(String s3:s2) {
				    result=result+Integer.parseInt(s3);
				}
			} 
		}
		System.out.println(result);
*/
/*
		// 3. int n=379
        // find if the given no is trendy no

         // 1. 3 digit no
         // 2. middle digit should be divisible by 3
		
		System.out.println("Enter number: "); 
		int n=sc.nextInt();

		String sint=Integer.toString(n);
		
		if(sint.length()==3 ) {
			if(sint.charAt(1)%3==0) {
			System.out.println("Number "+n+" is Trendy");
			}
		}else {
			System.out.println("Sorry This Number "+n+" is Not Trendy");
			System.out.println("Please Enter valid Number");
		}
*/
/*

		// 4. String str="rahul sachin vinod anil"

		//u have convert the first char of each word in upper case
		 
		String strn="rahul sachin vinod anil";
		String[] s11=strn.split(" ");
		String sAns;
		for (int i = 0; i < s11.length; i++) {
			sAns=s11[i].substring(0,1).toUpperCase()+s11[i].substring(1);
			System.out.println(sAns);
		}
		 

*/		
/*
 // Rahul Sachin Vinod Anil

// 5.  String str="rahul sachin vinod anil"
   // sort those string 

    // anil rahul sachin vinod
		
		
		String strg="rahul sachin vinod anil";
		String[] strg1=strg.split(" ");
		Arrays.sort(strg1);
		System.out.println("Sorted Array is ");
		for (String st:strg1) {
			System.out.println(st);
		}
	
*/
/*
		// 6. int n=12345;

		// print all the digits of the number and count the no of digits
		
		
		int n1=12345;
		String s7 = Integer.toString(n1);
		for (int i = 0; i < s7.length(); i++) {
			System.out.println("Digit "+(i+1)+" is "+s7.charAt(i));
		}
		System.out.println("Count is "+s7.length());
		
*/
		
		StringDemo stringDemo = new StringDemo();
		//stringDemo.allDigSum();
		
		//stringDemo.sumWhereTo();
		
		stringDemo.isTrendy();
		
		//stringDemo.firseCap();
		
		//stringDemo.sortString();
		
		//stringDemo.printAndCount();
		
	}
	
	public void allDigSum() {
		System.out.println("Enter Number String: ");
		String str=sc.next();
		
		int sum=0;
		
		for (int i = 0; i < str.length(); i++) {
			String ss =""+str.charAt(i);
			sum=sum+ Integer.parseInt(ss);
		}
		System.out.println("Sum of all Digit is "+sum);
	}
	
	
	public void sumWhereTo() {
		System.out.println("Enter Number String but Please seperate by ';': ");
		String str1=sc.next();
		
		String[] s1= str1.split(";");
		int result=0;
		
		for (int i = 0; i < s1.length; i++) {
			String string = s1[i];
			
			if (string.contains("2")) {
				String[] s2= {string};
				for(String s3:s2) {
				    result=result+Integer.parseInt(s3);
				}
			} 
		}
		System.out.println(result);
	}
	
	public void isTrendy() {
		System.out.println("Enter number: "); 
		int n=sc.nextInt();

		String sint=Integer.toString(n);
		
		if(sint.length()==3 && sint.charAt(1)%3==0) {
		{
			System.out.println("Number "+n+" is Trendy");
			}
		}else {
			System.out.println("Sorry This Number "+n+" is Not Trendy");
			System.out.println("Please Enter valid Number");
		}
	}
	
	public void firseCap() {
		//String strn="rahul sachin vinod anil";
		
		System.out.println("Enter String of names please separate by 'space' :");
		String strn=sc.nextLine();
		
		String[] s11=strn.split(" ");
		String sAns;
		for (int i = 0; i < s11.length; i++) {
			sAns=s11[i].substring(0,1).toUpperCase()+s11[i].substring(1);
			System.out.println(sAns);
		}
	}
	
	public void sortString() {
		//String strg="rahul sachin vinod anil";
		
		System.out.println("Enter String of names please separate by 'space' :");
		String strg=sc.nextLine();
		
		String[] strg1=strg.split(" ");
		Arrays.sort(strg1);
		System.out.println("Sorted Array is ");
		for (String st:strg1) {
			System.out.println(st);
		}
	}
	
	public void printAndCount() {
		
		//int n1=12345;
		
		System.out.println("Enter Number: ");
		int n1=sc.nextInt();
		String s7 = Integer.toString(n1);
		for (int i = 0; i < s7.length(); i++) {
			System.out.println("Digit "+(i+1)+" is "+s7.charAt(i));
		}
		System.out.println("Count is "+s7.length());
	}

	
}
