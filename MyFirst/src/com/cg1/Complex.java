package com.cg1;

public class Complex {
	private int real;
	private int imag;
	
	
	public Complex(int real, int imag) {
		this.real = real;
		this.imag = imag;
	}
	
	
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getImag() {
		return imag;
	}
	public void setImag(int imag) {
		this.imag = imag;
	}


	public String printComplex() {
		return "Complex Number is "+ real + " i"+ imag ;
	}
	
	

}
