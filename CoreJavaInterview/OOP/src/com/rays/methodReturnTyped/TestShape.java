package com.rays.methodReturnTyped;

public class TestShape {

	public static void main(String[] args) {

		// method retuen type

		// Shape c = Shape.getShape(1);
//		Shape r = Shape.getShape(2);
//		double a = c.area() + r.area();
//		System.out.println(c.area());
//		System.out.println(r.area());
//		System.out.println(a);

		Shape[] s = new Shape[2];

		s[0] = Shape.getShape(1);
		s[1] = Shape.getShape(2);

//		  Circle c = (Circle) s[0];
//		  
//		  Rectangle r = (Rectangle) s[1];

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].area());
		}

	}

}