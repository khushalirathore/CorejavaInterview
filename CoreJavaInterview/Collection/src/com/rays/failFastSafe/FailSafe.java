package com.rays.failFastSafe;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class FailSafe {
	public static void main(String[] args) {

		Vector v = new Vector();

		v.add("a");
		v.add("b");
		v.add("c");
		v.add("d");

		System.out.println(v);

		Enumeration e = v.elements();
		v.add(100);

		while (e.hasMoreElements()) {

			System.out.println(e.nextElement());

			// System.out.println(v);
		}
	}
}