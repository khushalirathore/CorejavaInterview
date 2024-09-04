package com.rays.exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class NoSuchExce {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Khushali");
		list.add("Rathore");

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("Element: " + element);
		}

		try {
			String element = iterator.next();
			System.out.println("Element: " + element);

		} catch (NoSuchElementException e5) {
			e5.printStackTrace();
			// System.out.println("exception: " + e5);

			//System.exit(0);

		}
	}
}
