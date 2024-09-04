package com.rays.collection;

public class TestEqualsAndHashCode {

	public static void main(String[] args) {
		EqualsHashCode e1 = new EqualsHashCode("Anshul", 100, 50);
		EqualsHashCode e2 = new EqualsHashCode("Anshul", 100, 50);
		// Student e2 = new Student("sdfdf", 50);

		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

	}

}