package com.rays.queue;

import java.util.PriorityQueue;

public class ATest {

	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue();

		q.add(2);
		q.add(1);
		q.offer(4);
		q.offer(3);

		System.out.println(q);

		System.out.println(q.peek());
		System.out.println(q);

		System.out.println(q.poll());
		System.out.println(q);

		System.out.println(q.element());
		System.out.println(q);

		System.out.println(q.remove());
		System.out.println(q);

	}

}
