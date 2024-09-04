package com.rays.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add('a');
		list.add('b');
		list.add('d');
		list.add('e');

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (Object obj : list) {
			System.out.println(obj);
		}

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
