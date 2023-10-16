package com.generalBank;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("ICICIBank InterestRates");
		ICICIBank icicibank = new ICICIBank();
		icicibank.getSavingInterestRate();
		icicibank.getFixedInterestRate();
		System.out.println();
		
		System.out.println("KotMBank InterestRates");
		KotMBank kotmbank = new KotMBank();
		kotmbank.getSavingInterestRate();
		kotmbank.getFixedInterestRate();
		System.out.println();
		
		System.out.println("GeneralBank InterestRates");
		GeneralBank genralbank1 = new ICICIBank();
		genralbank1.getSavingInterestRate();
		genralbank1.getFixedInterestRate();
		System.out.println();
		
		System.out.println("GeneralBank InterestRates");
		GeneralBank genralbank2 = new KotMBank();
		genralbank2.getSavingInterestRate();
		genralbank2.getFixedInterestRate();

	}

}
