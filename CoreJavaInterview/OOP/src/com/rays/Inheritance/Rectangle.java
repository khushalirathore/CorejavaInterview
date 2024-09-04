package com.rays.Inheritance;

public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
//
//	public int getLength() {
//		return length;
//
//	}
//
//	public void setLength(int length) {
//
//		this.length = length;
//	}
//
//	public int getWidth() {
//		return width;
//	}
//
//	public void setWidth(int width) {
//		this.width = width;
//	}
//
//	public void area() {
//		int rArea = length * width;
//		System.out.println("rectangel = " + rArea);
//	}

	public double area() {
		return length * width;
	}
	
	

}
