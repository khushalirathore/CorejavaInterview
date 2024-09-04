package com.rays.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		System.out.println(v);

		Iterator it = v.iterator();
		// v.addElement(25);
		while (it.hasNext()) {
			System.out.println(it.next());

		}

		System.out.println("----------------------");
		Enumeration en = v.elements();

		v.addElement(25);

		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());

		}

		System.out.println("----------------------");
		v.setElementAt("khushali", 0);
		//v.add(0, "dfgdf");
		System.out.println(v);

	}

}