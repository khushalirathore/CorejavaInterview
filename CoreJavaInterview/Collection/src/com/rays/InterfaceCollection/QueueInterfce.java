package com.rays.InterfaceCollection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterfce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue queue = new PriorityQueue();
		Queue queue1 = new LinkedList();

		queue.offer(121);
		queue.offer(122);
		queue.offer(123);
		queue.add(124);

		System.out.println("queue.element() : " + queue.element());
		System.out.println("queue.peek() : " + queue.peek());
		System.out.println(queue);
		System.out.println("queue.poll() : " + queue.poll());// provide first and remove it
		System.out.println("queue.remove() : " + queue.remove());// provide first and remove it
		System.out.println(queue);
		System.out.println("queue.remove(124) : " + queue.remove(124));

	}

}