package com.rays.list;

import java.util.ArrayList;
import java.util.List;

public class printMiddleOfList {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		System.out.println(list);

		System.out.println(list.get((list.size() - 1) / 2));

	}

}
