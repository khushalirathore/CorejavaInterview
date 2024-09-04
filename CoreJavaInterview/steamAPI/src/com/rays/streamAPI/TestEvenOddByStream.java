package com.rays.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TestEvenOddByStream {

	public static boolean oddEven(int i) {

		if (i % 2 == 0) {

			System.out.println(i + " = even ");

			return true;

		} else if (i % 2 != 0) {

			System.out.println(i + " = odd ");

			return true;

		}
		return false;

	}

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		// list.stream().distinct().filter(c -> oddEven(c)).forEach(c ->
		// System.out.println());

		list.stream().distinct().filter(c -> (c % 2 == 0)).forEach(c -> {
			System.out.println("even = " + c);   
		});    
		list.stream().distinct().filter(c -> (c % 2 != 0)).forEach(c -> {
			System.out.println("odd = " + c);
		});

	}

}