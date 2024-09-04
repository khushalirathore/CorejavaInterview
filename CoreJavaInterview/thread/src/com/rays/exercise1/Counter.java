package com.rays.exercise1;

public class Counter extends Thread {
	private Storage storage;

	public Counter(Storage storage) {
		this.storage = storage;
	}

	@Override
	public void run() {
		int count = 0;
		while (count < 10) {
			count++;
			storage.setValue(count);
			try {
				Thread.sleep(1000); // Sleep for 1 second before incrementing again
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}