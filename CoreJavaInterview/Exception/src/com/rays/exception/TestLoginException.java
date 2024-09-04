package com.rays.exception;

public class TestLoginException {
	public static void main(String[] args) {

		String name = "admi";

		try {
			if (name.equals("admin")) {
				System.out.println("valid user");
			} else {
				throw new LoginException();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}