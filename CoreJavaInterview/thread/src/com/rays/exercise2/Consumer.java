package com.rays.exercise2;

import java.util.LinkedList;
import java.util.Queue;

public class Consumer implements Runnable {
	private final int limit;

	public Consumer(int limit) {
		this.limit = limit;
	}

	@Override
	public void run() {
		for (int i = 1; i <= limit; i++) {
			synchronized (this) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Consumed: " + i);
				notify();
			}
		}
	}

	public static void main(String[] args) {
		int limit = 10;
		Producer producer = new Producer(limit);
		Consumer consumer = new Consumer(limit);

		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);

		producerThread.start();
		consumerThread.start();
	}
}