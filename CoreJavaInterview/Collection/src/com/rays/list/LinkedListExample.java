  package com.rays.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.add(10);
		list.add(20);
		list.add(30);

		LinkedList list1 = new LinkedList();

		list.add("a");
		list.add("b");
		list.add(30);
		
		
		System.out.println(list);

		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println(list.indexOf(30));
		System.out.println(list);
		
		System.out.println(list.lastIndexOf(30));
		System.out.println(list);

		System.out.println(list.get(2));
		System.out.println(list);

		System.out.println(list.set(1, 40));
		System.out.println(list);

		System.out.println(list.isEmpty());
		System.out.println(list);

		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);

		}

	}

}
