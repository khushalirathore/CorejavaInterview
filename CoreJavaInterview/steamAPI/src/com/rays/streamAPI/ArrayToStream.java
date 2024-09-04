package com.rays.streamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {

	public static void main(String[] args) {

		String[] str = { "abc", "def", "ghi", "jkl", "mno" };

		Stream<String> stream = Arrays.stream(str);

		stream.sorted().distinct().forEach(e -> {
			System.out.println(e);
		});

		System.out.println("__________________");

		Stream<String> stream1 = Arrays.stream(str);

		stream1.map(e -> e.toUpperCase()).forEach(e -> {
			System.out.println(e);
		});

	}

}