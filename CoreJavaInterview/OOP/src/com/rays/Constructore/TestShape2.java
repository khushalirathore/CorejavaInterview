package com.rays.Constructore;

public class TestShape2 {

	public static void main(String[] args) {

		// constructore
		Shape1[] s = new Shape1[2];

//		s[0] = new Rectangle(10, 20);
//		s[1] = new Circle(10);

		System.out.println(s[0].area());
		System.out.println(s[1].area());

		// System.out.println( s[0].area() +s[1].area() );
	}
}
