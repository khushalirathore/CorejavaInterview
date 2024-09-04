  package com.rays.queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class ArrayDqueueExamples {

	public static void main(String[] args) {

		ArrayDeque q = new ArrayDeque();

		// offer pool peek = addition methods

		q.offer(2);
		q.offer(1);
		q.offer(3);

		System.out.println(q);

		// peekLast() get last element
		System.out.println(q.peekFirst() + " get top element");
		System.out.println(q);

		// pollLast() get and remove last element
		System.out.println(q.pollFirst() + " get top element and remove");
		System.out.println(q);

//		q.forEach(System.out::println);

		Iterator it = q.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

}