package com.rays.set;

import java.util.TreeSet;

public class SortedTreeSet {

	public static void main(String[] args) {

		TreeSet t = new TreeSet();

		t.add(37);
		t.add(8);
		t.add(2);
		t.add(40);
		t.add(8);
		t.add(188);
		t.add(3);

		System.out.println(t);
		System.out.println("-----------------------------------------------------------------");

		System.out.println(t.floor(100));
		System.out.println("-----------------------------------------------------------------");
		System.out.println(t.first());
		System.out.println("-----------------------------------------------------------------");
		System.out.println(t.higher(100));
		System.out.println("-----------------------------------------------------------------");
		System.out.println(t.subSet(0, 40));
	}

}
