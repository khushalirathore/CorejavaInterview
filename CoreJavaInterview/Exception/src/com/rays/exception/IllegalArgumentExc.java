package com.rays.exception;

public class IllegalArgumentExc {

	public static void main(String[] args) {
		try {
			int result = divide(10, 0); 
			System.out.println("Result: " + result);
		} catch (IllegalArgumentException e) {
			System.err.println("Error: " + e.getMessage());
		}
		
	}

	public static int divide(int dividend, int divisor) {
		if (divisor == 0) {
			throw new IllegalArgumentException("Division by zero is not allowed.");
		}
		return dividend / divisor;
	}
}