package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionReverse {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		
		Collections.reverse(list);
		System.out.println(list);
	}

}
