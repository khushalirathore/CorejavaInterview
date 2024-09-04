package com.rays.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDublicateFromArray {

	public static void main(String[] args) {
		List list = new ArrayList();

		list.add('a');
		list.add('b');
		list.add('c');
		list.add('a');
		list.add('b');
		list.add('d');
		
		
		Set s = new HashSet(list);
		System.out.println(s);
	}

}
