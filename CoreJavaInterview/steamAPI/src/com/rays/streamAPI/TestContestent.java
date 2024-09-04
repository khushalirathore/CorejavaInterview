package com.rays.streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestent {

	public static void main(String[] args) {

		List<Contestent> list = new ArrayList<Contestent>();

		list.add(new Contestent(898587243, "Anshul"));
		list.add(new Contestent(759632587, "Ramdulera"));
		list.add(new Contestent(9865325, "BhupendrJoggi"));
		list.add(new Contestent(75369852, "Punit"));
		list.add(new Contestent(789652536, "Binod"));
		list.add(new Contestent(985651547, "Baldew"));
		list.add(new Contestent(985878546, "Anshul"));

		list.stream()
		.map(e -> e.getName() + " " + e.getPhoneNo())
		.distinct()
		.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);

					return e.stream();

				})).limit(3).forEach(e -> {
					System.out.println(e);
					});

	}

}