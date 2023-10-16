package com.figureArea;

public class Rectangle extends Figure{
	double areaOfRectangle;
	
	
	public void area(int length,int breath) {
		areaOfRectangle = length*breath;
		System.out.println(areaOfRectangle);
	}

}
