package com.rays.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		LinkedHashSet h = new LinkedHashSet();

		h.add(1);
		h.add("a");
		h.add(5);
		h.add("$");

		System.out.println(h);
		System.out.println("----------------------------------");
		System.out.println(h.getClass());
	}

}
