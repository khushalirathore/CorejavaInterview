package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectinsMethod {

	public static void main(String[] args) {

		Collection list = new ArrayList();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		Collection list2 = new ArrayList();

		list2.add("a");
		list2.add("b");
		list2.add(4);
		list2.add(5);

		System.out.println(list);

		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}

		System.out.println("list.contains(2) = " + list.contains(2));
		System.out.println(list);

		System.out.println("list.size() = " + list.size());
		System.out.println(list2);

		System.out.println("list.addAll(list) = " + list.addAll(list2));
		System.out.println(list);

		System.out.println("list.containsAll(list)= " + list.containsAll(list2));
		System.out.println(list);

		System.out.println("list.isEmpty() = " + list.isEmpty());
		System.out.println(list);

		System.out.println("list.retainAll(list2) = " + list.retainAll(list2));
		System.out.println(list);

		System.out.println("asdfg" + list.remove(3));
		System.out.println(list);

		list.clear();

		System.out.println(list);

	}
}
