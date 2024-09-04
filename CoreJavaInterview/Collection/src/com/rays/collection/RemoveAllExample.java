package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class RemoveAllExample {

	public static void main(String[] args) {
		Collection c = new ArrayList();

		c.add(1);
		c.add(2);
		c.add(3);

		Collection c1 = new ArrayList();

		c1.add(1);
		c1.add(2);
		c1.add(2);

		System.out.println(c.removeAll(c1));
		System.out.println(c);

	}

}
