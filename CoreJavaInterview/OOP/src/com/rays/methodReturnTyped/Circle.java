package com.rays.methodReturnTyped;

public class Circle extends Shape {

	private int radius;

	public static final double PI = 3.14;

	public Circle(int radius) {
		this.radius = radius;
	}

	public double area() {
		double cArea = PI * radius * radius;
		System.out.println("Circle Area = " + cArea);
		return cArea;
	}

}
