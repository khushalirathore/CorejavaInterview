package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {

	public static void main(String[] args) {

		Vector list = new Vector();

		list.addElement(10);
		list.addElement("a");
		list.addElement("b");
		list.addElement(1);
		
		Enumeration e = list.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
