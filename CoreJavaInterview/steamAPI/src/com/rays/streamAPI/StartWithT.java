package com.rays.streamAPI;

import java.util.Arrays;

public class StartWithT {
	public static void main(String[] args) {
		// List<String> list = Arrays.asList("one", "two", "three", "three", "four");
		String[] name = { "one", "two", "three", "three", "four" };

		Arrays.stream(name).map(e -> e.toUpperCase()).filter(e -> e.startsWith("T")).distinct()
				.forEach(e -> System.out.println(e));
	}
}