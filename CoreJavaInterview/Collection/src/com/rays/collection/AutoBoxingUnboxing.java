package com.rays.collection;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {

		int primitiveInt = 1;

		Integer wrapper = primitiveInt;
		System.out.println(primitiveInt);
		System.out.println(wrapper);

		Integer wrapper1 = new Integer(15);
		int primitive1 = wrapper1;

		System.out.println(wrapper1);
		System.out.println(primitive1);
	}

}
