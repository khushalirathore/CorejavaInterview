package com.rays.InterfaceCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		HashSet set = new HashSet();

		set.add("khushali");
		set.add("Paras");
		set.add("Paras");
		set.add("Mahajan");
		set.add("abc");

		// System.out.println(set);

		Set s = new HashSet(set);
		System.out.println(s);

		System.out.println("contain method" + " = " + set.contains("rathore"));
		System.out.println("isEmpty method" + " = " + set.isEmpty());
		System.out.println("size method" + " = " + set.size());
		System.out.println("Remove method" + " = " + set.remove("abc"));
		set.clear();
		System.out.println("-----------------------");

		TreeSet t = new TreeSet();

		t.add("khushali");
		t.add("rathore");
		t.add("Paras");
		t.add("Mahajan");
		t.add("abc");

		System.out.println("contain method" + " = " + t.contains("kh"));
		System.out.println("celeing methos " + "  = " + t.ceiling("khush"));
		System.out.println("first method" + " = " + t.first());
		System.out.println("pollfirst method" + " = " + t.pollFirst());
		System.out.println("lower method" + " = " + t.lower("Paras"));
		System.out.println("tSet.higher(125) : " + t.higher("Mahajan"));
		System.out.println("tSet.size() : " + t.size());
		System.out.println(t);
		System.out.println("-----------");

		LinkedHashSet set1 = new LinkedHashSet();

		set1.add(121);
		set1.add("khushi");
		set1.add(123);
		set1.add(124);
		set1.add(125);

		System.out.println("set.contains(122) : " + set1.contains(122));
		System.out.println("set.isEmpty() : " + set1.isEmpty());
		System.out.println("set.size() : " + set1.size());
		System.out.println("set.remove(129) : " + set1.remove(125));
		System.out.println("set1.hashCode() : " + set1.hashCode());
		System.out.println("set1.toArray() : " + set1.toArray());

	}

}
