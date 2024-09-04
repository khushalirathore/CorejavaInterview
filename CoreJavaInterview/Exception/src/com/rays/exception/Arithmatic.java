package com.rays.exception;

public class Arithmatic {

	public static void main(String[] args) {

		try {
			int i = 10 / 0;

			System.out.println("sum = " + i);

		} catch (ArithmeticException e) {
			e.printStackTrace();
			// System.exit(0);

		} finally {
			System.out.println("finally block");
		}

	}

}