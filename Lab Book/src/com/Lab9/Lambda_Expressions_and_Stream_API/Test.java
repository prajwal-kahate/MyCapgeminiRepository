package com.Lab9.Lambda_Expressions_and_Stream_API;
import java.lang.Math.*;
public class Test {

	public static void main(String[] args) {
		// Exercise 1: Write a lambda expression which accepts x and y 
		//numbers and return xy.
		
		 NumPower numP=(x,y)-> Math.pow((double)x, (double)y);
		 double ans = numP.numPowerNum(3, 3);
		 System.out.println(ans);

	}

	

}
