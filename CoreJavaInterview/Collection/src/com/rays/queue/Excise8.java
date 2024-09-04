package com.rays.queue;

import java.util.Enumeration;
import java.util.Stack;

public class Excise8 {

	public static void main(String[] args) {

		Stack s = new Stack();

		for (char i = 'a'; i <= 'd'; i++) {
			System.out.println(s.push(i));
		}

//			Enumeration e = s.elements();
//			while(e.hasMoreElements()) {
//				System.out.println(e.nextElement());
//				
//			}

		Stack s1 = new Stack();

		while (!s.isEmpty()) {
			System.out.println(s1.push(s.pop()));
		}

		// System.out.println(s);
	}

}
