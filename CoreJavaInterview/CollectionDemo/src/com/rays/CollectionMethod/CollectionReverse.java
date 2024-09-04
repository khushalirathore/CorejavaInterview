package com.rays.CollectionMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionReverse {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Collections.reverse(list);
		System.out.println(list);
	}

}
