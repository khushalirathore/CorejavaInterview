package com.rays.exception;

public class TeyWithMultipal {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;

		String name = null;

		try {

			int c = a / b;

			System.out.println("Division = " + c);

			// System.exit(0);

			System.out.println(name.length());
			//System.exit(0);
			

		} catch (ArithmeticException e) {
			
			e.printStackTrace();
		System.exit(0);
		} catch (NullPointerException e) {
			

			e.printStackTrace();

		} catch (Exception e) {

			e.printStackTrace();

		}

		finally {
			System.out.println("asdfjk");
		}

	}

}