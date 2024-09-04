package com.rays.streamAPI;

import java.util.stream.Stream;

public class StreamToArrays {

	public static void main(String[] args) {
		Stream<String> stringStream = Stream.of("a", "b", "c");

		String[] stringArray = stringStream.toArray(e -> new String[e]);

		System.out.println(stringArray[0]);
	}

}
