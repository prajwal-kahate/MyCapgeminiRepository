package com.Practice;

import java.util.Scanner;

abstract class Car {
	int milage;

	Car(int milage) {
		this.milage = milage;
	}

	abstract String getMilage();
}

class WagnoR extends Car {
	WagnoR(int milage) {
		super(milage);
	}

	@Override
	String getMilage() {
		return "WagnoR" + milage + "Kmpl";
	}
}

class HondaCity extends Car {
	HondaCity(int milage) {
		super(milage);
	}

	@Override
	public String getMilage() {
		return "HondCity" + milage + "Kmpl";
	}
}

class InovaCrysta extends Car {
	InovaCrysta(int milage) {
		super(milage);
	}

	@Override
	public String getMilage() {
		return "HondaCity" + milage + "Kmpl";
	}
}


