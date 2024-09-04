package com.rays.streamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestDublicate {

	public static void main(String[] args) {
		List l = Arrays.asList(2, 4, 4, 5, 6, 6, 7, 7);

		Set s = new HashSet();

		l.stream().filter(e -> !s.add(e)).forEach(e -> {
			System.out.println(e);
		});
	}
}
