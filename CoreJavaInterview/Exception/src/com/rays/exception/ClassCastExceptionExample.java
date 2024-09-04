package com.rays.exception;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Object obj = "asd";

		try {

			Integer s = (Integer) obj;
			System.out.println("String value: " + s);
		} catch (ClassCastException e) {

			e.printStackTrace();

		}
	}
}
