package com.SmallEx;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="20;30;40;50";
		//str.split(";");
		String[] strArray = str.split(";");
		int sum=0;
		
		for (String s:strArray) {
			//System.out.println(Integer.parseInt(s));
			sum=sum+Integer.parseInt(s);
			System.out.println(sum);
			
		}
		 

	}


}
