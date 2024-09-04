package com.rays.CostumUnchecked;

public class TestCostumUnchecked {

	public static void main(String[] args) {

		try {
			dad();
		} catch (CustomUnChecked e) {
			e.printStackTrace();
		}
	}

	public static void dad() {

		mom();

	}

	public static void mom() {

		son();

	}

	public static void son() {

		CustomUnChecked e = new CustomUnChecked();

		throw e;

	}

}
