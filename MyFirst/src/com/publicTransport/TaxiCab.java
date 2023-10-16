package com.publicTransport;

public class TaxiCab implements PublicTransport{
	

	public double calculateFare(int d) {
		double fare=RATE*d+min_amount;
		return fare;
	}

}
