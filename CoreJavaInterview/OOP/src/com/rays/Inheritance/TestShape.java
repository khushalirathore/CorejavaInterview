package com.rays.Inheritance;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Shape();
		s.area();

		Rectangle r = new Rectangle(10 , 10);
		r.area();

////		Shape shape = new Rectangle();
////		shape.area();
////
////		Rectangle rec = (Rectangle) shape;
////		rec.setLength(10);
////		rec.setWidth(2);
////		rec.area();
//		
//		
////		Shape r = new Rectangle(10, 10);
////		System.out.println(r.area());

	}
}
