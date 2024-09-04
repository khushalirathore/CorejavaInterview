package com.rays.exception;

public class NumberFormateExcption {
	public static void main(String[] args) {
		String numberStr = "123abc";

		try {
			int number = Integer.parseInt(numberStr);
			System.out.println("Parsed number: " + number);
		} catch (NumberFormatException e) {

			e.printStackTrace();
		}
	}
}