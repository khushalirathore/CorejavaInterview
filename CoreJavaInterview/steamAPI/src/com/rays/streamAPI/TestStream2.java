package com.rays.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStream2 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("one", "two", "three", "four", "three");

		Stream<String> stream = list.stream();

		stream.map(e -> e.toUpperCase()).forEach(e -> {
			System.out.println(e);
		});

//		stream.filter(e -> e.startsWith("t")).forEach(e -> {
//			System.out.println(e);
//		});
//
//		stream.sorted().forEach(e -> {
//			System.out.println(e);
//		});
//
//		stream.distinct().forEach(e -> {
//			System.out.println(e);
//		});
	}

}
