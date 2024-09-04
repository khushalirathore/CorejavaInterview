package com.rays.InterfaceCollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapInterface {

	public static void main(String[] args) {

		HashMap map = new HashMap();

		map.put(1, "khushali");
		map.put(2, "paras");
		map.put(3, "Sanjay");
		map.put(4, "hemendra");

		System.out.println("map.size() : " + map.size());
		System.out.println("map.isEmpty() : " + map.isEmpty());
		System.out.println("map.get(102) : " + map.get(2));
		System.out.println("map.containsKey(103) : " + map.containsKey(3));
		System.out.println("map.containsValue('c') : " + map.containsValue("paras"));
		System.out.println("map.entrySet() : " + map.entrySet());
		System.out.println("map.keySet() : " + map.keySet());
		System.out.println("map.values() : " + map.values());
		map.clear();
		System.out.println(map);

		System.out.println("<----------------->");

		TreeMap t = new TreeMap();

		t.put(1, "khushali");
		t.put(2, "paras");
		t.put(3, "Sanjay");
		t.put(4, "hemendra");
		

		System.out.println();
		System.out.println("tMap.firstKey() : " + t.firstKey());
		System.out.println("tMap.lastKey() : " + t.lastKey());
		System.out.println("tMap.firstEntry() : " + t.firstEntry());
		System.out.println("tMap.lastEntry() : " + t.lastEntry());
		
		System.out.println("---------------------");

		LinkedHashMap m = new LinkedHashMap();

		m.put(1, "khushali");
		m.put(2, "paras");
		m.put(3, "Sanjay");
		m.put(4, "hemendra");

		System.out.println("map1.get(102) : " + m.get(2));
		System.out.println("map1.containsValue('d') : " + m.containsValue("paras"));
		System.out.println("map1.getOrDefault(1, null) : " + m.getOrDefault(1, null));
		System.out.println(m);
		System.out.println("map1.entrySet() : " + m.entrySet());
		System.out.println("map1.keySet() : " + m.keySet());
		System.out.println("map1.values() : " + m.values());
	}

}
