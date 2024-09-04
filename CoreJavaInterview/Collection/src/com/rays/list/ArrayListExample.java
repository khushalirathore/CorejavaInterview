package com.rays.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList list1 = new ArrayList();

		list1.add(10);
		list1.add(20);
		list1.add(30);

		ArrayList list2 = new ArrayList();

		list2.add("a");
		list2.add("b");
		list2.add(10);
		
		System.out.println(list1);

		System.out.println(list1.size());
		System.out.println(list1);
		
		//System.out.println(list1.addAll(list2));

		System.out.println(list1.contains(40));
		System.out.println(list1);

		System.out.println(list1.containsAll(list2));
		System.out.println(list1);

		System.out.println(list1.isEmpty());
		System.out.println(list1);

		System.out.println(list1.remove(2));
		System.out.println(list1);

		Iterator it = list1.iterator();

		while (it.hasNext()) {
			Object obj = it.next();

			System.out.println(obj);

		}

	}

}
