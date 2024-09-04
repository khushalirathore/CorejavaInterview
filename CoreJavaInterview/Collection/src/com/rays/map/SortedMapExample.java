package com.rays.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {

	public static void main(String[] args) {

		SortedMap map = new TreeMap();

		map.put(5, 20);
		map.put(2, 40);
		map.put(1, 10);
		map.put(3, "a");
		map.put(4, 50);

		System.out.println(map);

		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		
		System.out.println(map.tailMap(4));
		System.out.println(map.subMap(2, 5));
		

	}

}
