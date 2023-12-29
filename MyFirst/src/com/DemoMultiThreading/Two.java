package com.DemoMultiThreading;

public class Two extends One{

	int a = 20;
	
	
	
	public static void main(String[] args) {
		One one = new Two();
//		System.out.println(one.a);
		one.m1();
		char[] cc = new char[5];
		
		
		Integer in = new Integer(3);
		Integer in1 = new Integer(3);
		if (in.equals(in1)) {
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		
	}
}
