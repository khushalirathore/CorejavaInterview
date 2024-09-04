package com.rays.queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueInterfaceExample {

	public static void main(String[] args) {
		Queue q = new ArrayBlockingQueue(3);

		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);

		//q.add(4);

		System.out.println(q);
	}
}
