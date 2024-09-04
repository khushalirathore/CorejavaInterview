package com.rays.exercise2;

import java.util.Queue;

public class Producer implements Runnable {
	private final int limit;

	public Producer(int limit) {
		this.limit = limit;
	}

	@Override
	public void run() {
		for (int i = 1; i <= limit; i++) {
			System.out.println("Produced: " + i);
			synchronized (this) {
				notify();
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		synchronized (this) {
			notify();
		} // Notify the consumer to finish
	}
}