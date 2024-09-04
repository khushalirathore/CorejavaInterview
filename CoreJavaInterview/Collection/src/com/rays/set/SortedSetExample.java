package com.rays.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
	public static void main(String[] args) {

		SortedSet s = new TreeSet();

		s.add("a");
		s.add("z");
		s.add("h");
		s.add("c");
		s.add(2);

		System.out.println(s);
		
		

	}

}
