package com.rays.immutable;

public final class Immutable {

	private final int value;

	public Immutable(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static void main(String[] args) {

		Immutable obj = new Immutable(20);

		System.out.println(obj.getValue());

	}
}