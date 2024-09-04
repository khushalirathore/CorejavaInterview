package com.rays.failFastSafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {

	public static void main(String[] args) {
		List list = new ArrayList();
    
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");

		Iterator it = list.iterator();

		while (it.hasNext()) {
			list.add(100);
			System.out.println(it.next());
		}

	}

}
  