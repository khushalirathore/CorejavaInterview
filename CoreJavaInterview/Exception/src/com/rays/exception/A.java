package com.rays.exception;

public class A {

	public static void main(String[] args) {

		int a = 10;

		int b = 0;

		String name = null;

		try {
			
			int c = a / b;

			System.out.println("Division = " + c);

			System.out.println(name.length());

		} catch (ArithmeticException | NullPointerException e2 ) {

		
			e2.printStackTrace();

		}
	}
}
