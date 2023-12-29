package com.Practice;

import java.util.Scanner;

class CarFeatures {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int milage1;
		switch (num)

		{
		case 1:
			milage1 = sc.nextInt();
			WagnoR w = new WagnoR(milage1);
			System.out.println(w.getMilage());
		case 2:
			milage1 = sc.nextInt();
			HondaCity hc = new HondaCity(milage1);
			System.out.println(hc.getMilage());
		case 3:
			milage1 = sc.nextInt();
			InovaCrysta in = new InovaCrysta(milage1);
			System.out.println(in.getMilage());
		default:
			System.out.println("No data found");
		}
	}
}