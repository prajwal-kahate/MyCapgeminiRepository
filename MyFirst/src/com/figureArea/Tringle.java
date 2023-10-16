package com.figureArea;

public class Tringle extends Figure{
	
	public double areaOfTringle; 
	
	public void area(int length,int breath) {
		areaOfTringle = 0.5*length*breath;
		System.out.println(areaOfTringle);
	}

}
