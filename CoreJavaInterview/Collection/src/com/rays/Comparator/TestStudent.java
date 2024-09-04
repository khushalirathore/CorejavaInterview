package com.rays.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();

		a.add(new Student(12, "khushali", 100));
		a.add(new Student(1, "khusli", 10));
		a.add(new Student(2, "Joe", 448));
		a.add(new Student(3, "Rose", 257));

//		SortByName n = new SortByName();
//		Collections.sort(a, n);
//		System.out.println("SortByName:");
//		for (Object o : a) {
//			System.out.println(o);
//		}
//		System.out.println("-----------------------------------------------------------------");

		SortById i = new SortById();
		System.out.println("SortById");
		Collections.sort(a, i);
		for (Object o : a) {
			System.out.println(o);
		}
		System.out.println("-----------------------------------------------------------------");

//		SortByMarks s = new SortByMarks();
//		Collections.sort(a, s);
//		for (Object o : a) {
//			System.out.println(o);
//		}
//		System.out.println("-----------------------------------------------------------------");
//
//		SortByIdMarksName in = new SortByIdMarksName();
//		Collections.sort(a, in);
//		for (Object o : a) {
//			System.out.println(o);
//		}
//		System.out.println("-----------------------------------------------------------------");

	}
}
