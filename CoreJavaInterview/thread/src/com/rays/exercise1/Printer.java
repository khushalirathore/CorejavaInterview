package com.rays.exercise1;

public class Printer extends Thread {
	 private Storage storage;

	    public Printer(Storage storage) {
	        this.storage = storage;
	    }

	    @Override
	    public void run() {
	        int count = 0;
	        while (count < 10) { // Loop runs 10 times
	            count++;
	            System.out.println("Current value: " + storage.getValue());
	            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Storage storage = new Storage();

		Counter counterThread = new Counter(storage);
		Printer printerThread = new Printer(storage);

		counterThread.start();
		printerThread.start();
	}
}