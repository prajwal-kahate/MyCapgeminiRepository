package com.publicTransport;

public interface PublicTransport {
	double RATE = 12.0; // Rate per km

    double min_amount = 30.0;

    double calculateFare(int d);


}
