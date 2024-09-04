package com.rays.list;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add(10);
		list.add(20);
		list.add(60);
		list.add("asd");
		list.add(40);

//		ArrayList list1 = new ArrayList();
//
//		list1.add(33);
//		list1.add(203);
//		list1.add(360);
//		list1.add("asd");
//		list1.add(430);

		System.out.println(list);

		System.out.println(list.indexOf(40));
		System.out.println(list);

		System.out.println(list.lastIndexOf(40));
		System.out.println(list);

		System.out.println(list.subList(0, 3));
		System.out.println(list);

		System.out.println(list.remove(3));
		System.out.println(list);

		System.out.println(list.get(2));
		System.out.println(list);

//		System.out.println(list.set(2, "ab"));
//		System.out.println(list);

	}
}
