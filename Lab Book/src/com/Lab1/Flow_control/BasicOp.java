package com.Lab1.Flow_control;

import java.util.Iterator;
import java.util.Scanner;

public class BasicOp {
	
	public void even() {
		
	}
	
	Scanner sc = new Scanner(System.in);
	//Exercise 1: Create a method to find the sum of the cubes of 
	//the digits of an n digit number
	long sum = 0;
	public long cubeSum(int n) {
		for (int i = 1; i <= n; i++) {
			sum=sum+(i*i*i);
		}
		return sum;
	}
	// Exercise 2: Write a java program that simulates a traffic light. The program
	// lets the user select one of three lights: red, yellow, or green with radio
	// buttons. On entering the choice, an appropriate message with “stop” or
	// “ready” or “go” should appear in the console .Initially there is no message
	// shown.
	
	public String trafficChang() {
		
		String string = null;
		
		System.out.println("Enter Light color '1.red' '2.yellow' '3.green' ");
		String light  =sc.next().toLowerCase();
		switch (light) {
		case "red":
			string = "Stop";
			break;
		case "yellow":
			string = "ready";
			break;
		case "green":
			string = "go";
			break;

		default:
			System.out.println("Give valid Answer ");
			break;
		}
		return string;
		
	}
	
	// Exercise 3: The Fibonacci sequence is defined by the following rule. The
	// first 2 values in the sequence are 1, 1. Every subsequent value is the sum of
	// the 2 values preceding it. Write a Java program that uses both recursive and
	// non-recursive functions to print the nth value of the Fibonacci sequence?
	
	public void fibonachi(int a, int b, int n) {
		int sum = a+b;
		
		System.out.print(a +" "+ b+" ");
		for (int i = 1; i <= n; i++) {
			sum =a+b;
			a=b;
			b=sum;
			System.out.print(sum+" ");
		}
		System.out.println();
		
	}
	
	// Exercise 4: Write a Java program that prompts the user for an integer and
	// then prints out all the prime numbers up to that Integer?
	
	public void printPrime(int num) {
		for (int i = 2; i < num; i++) {
			for (int j = 2; j < i; j++) {
				
			}
			//if (i%) {
				
			//} 
		}
	}
	

}
