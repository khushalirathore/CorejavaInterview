package com.rays.exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Abc {
	public static void main(String[] args) {

		String name = "Amisha";
		// String[] name1 = {"Amisha"} ;
		int a = 10 / 2;

		List<String> list = new ArrayList<>();
		list.add("Element 1");
		list.add("Element 2");

		Iterator<String> iterator = list.iterator();

		// Trying to retrieve elements using iterator
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("Element: " + element);
		}

		try {
			System.out.println(a);
			System.out.println(name.charAt(5));
			// System.out.println(name1[4]);
			// System.out.println(name.length());

			String element = iterator.next(); // This line will throw NoSuchElementException
			System.out.println("Element: " + element);

		} catch (NullPointerException e) {
			e.printStackTrace();

			// System.out.println(e);

		} catch (StringIndexOutOfBoundsException e2) {
			e2.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException e3) {
			e3.printStackTrace();

		} catch (ArithmeticException e4) {
			e4.printStackTrace();

		} catch (NoSuchElementException e5) {
			e5.printStackTrace();
			// System.out.println("exception: " + e5);

			System.exit(0);

		} finally {
			System.out.println("finally");
		}
	}
}