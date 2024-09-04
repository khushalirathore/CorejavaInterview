package com.rays.exercise1;

public class Storage {
	  private int value;

	    // Method to set value
	    public synchronized void setValue(int value) {
	        this.value = value;
	    }

	    // Method to get value
	    public synchronized int getValue() {
	        return value;
	    }
	}
