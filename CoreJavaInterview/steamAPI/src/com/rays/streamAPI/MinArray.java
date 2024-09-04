package com.rays.streamAPI;

import java.util.Arrays;
import java.util.OptionalInt;

public class MinArray {
	public static void main(String[] args) {
		int[] i = { 1, 2, 3, 8, 5 };

		Arrays.stream(i).min().ifPresent(e -> {
			System.out.println(e);
		});
		Arrays.stream(i).max().ifPresent(e -> {
			System.out.println(e);
		});
	}
}
