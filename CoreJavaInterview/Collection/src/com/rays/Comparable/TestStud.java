package com.rays.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestStud {
	public static void main(String[] args) {

		ArrayList list = new ArrayList<Student1>();

		list.add(new Stud(4, 85));
		list.add(new Stud(4, 86));

		Collections.sort(list);

		for (Object o : list) {
			System.out.println(o);
		}

	}

}
