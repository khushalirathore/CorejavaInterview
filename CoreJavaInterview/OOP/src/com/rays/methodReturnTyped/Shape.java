package com.rays.methodReturnTyped;

public class Shape {

	public double area() {
		System.out.println("Shape Area Method..!!!");
		return 0;
	}

	public static Shape getShape(int i) {

		if (i == 1) {

			return new Circle(10);
		}

		if (i == 2) {
			return new Rectangle(10, 10);
		}

		return new Shape();

	}
}