package com.rays.methodReturnTyped;

public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public double area() {
		double rArea = length * width;
		//System.out.println("Rectangle Area = " + rArea);
		return rArea;
	}
}
