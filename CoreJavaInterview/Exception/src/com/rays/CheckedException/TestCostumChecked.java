package com.rays.CheckedException;

public class TestCostumChecked {

	public static void main(String[] args) {
		try {
			dad();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void dad() throws CustomChecked {
		// TODO Auto-generated method stub
		mom();
	}

	public static void mom() throws CustomChecked {

		son();

	}

	public static void son() throws CustomChecked {

		CustomChecked e = new CustomChecked();

		throw e;

	}

}