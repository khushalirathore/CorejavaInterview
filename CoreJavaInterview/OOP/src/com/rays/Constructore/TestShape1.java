package com.rays.Constructore;

public class TestShape1 {
	public static void main(String[] args) {

		// setter gether
		Shape1[] s = new Shape1[2];

		s[0] = new Rectangle();
		s[1] = new Circle();

		Rectangle r = (Rectangle) s[0];
		r.setWidth(5);
		r.setLength(10);
		
		Circle c = (Circle) s[1];
		c.setRadius(10);

		for (int i = 0; i < s.length; i++) {

			s[i].area();

		}

	}

}