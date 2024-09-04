package com.rays.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
	public static void main(String[] args) {

		ArrayList list = new ArrayList<Student1>();

		list.add(new Student1(6, "khushali", 85, 1));
		list.add(new Student1(15, "khushali", 85, 1));

		Collections.sort(list);

		for (Object o : list) {
			System.out.println(o);
		}

	}

}
