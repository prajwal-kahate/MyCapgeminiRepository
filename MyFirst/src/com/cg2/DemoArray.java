package com.cg2;

import java.util.Iterator;
import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[][] data = {

				{ "Strno", "Stname", "Marks" }, { "1", "Rahul", "90" }, { "2", "Prajwal", "80" },
				{ "3", "Bharat", "70" }, { "4", "Moin", "75" }, { "5", "chandu", "85" }, {}

		};
		System.out.println("Enter the Student Rollno: ");
		int rno = sc.nextInt();

		boolean flag = false;
		for (int i = 1; i < data.length; i++) {

			if (rno == Integer.parseInt(data[i][0])) {
				System.out.println(data[i][1] + "  " + data[i][2]);
				flag = true;
			}

		}
		if (!flag) {
			System.out.println("Sorry");
		}

	}

	/**
	 * 
	 * for (int i = 0; i < data.length; i++) { for (int j = 0; j < data[i].length;
	 * j++) { System.out.print(" " + data[i][j]); } System.out.println(); }
	 * 
	 **/

}
