package com.rays.constructorcalling;

public class ConsOverLoading {

	public ConsOverLoading() {
		System.out.println("this is defoult constoctor");
	}

	public ConsOverLoading(int id) {
		System.out.println("This is one param constroctur = " + id);
	}

	public ConsOverLoading(int id, String name) {
		System.out.println("This is Two param constroctur = " + id + " " + name);
	}

	public static void main(String[] args) {
		ConsOverLoading k = new ConsOverLoading();
		ConsOverLoading k1 = new ConsOverLoading(1);
		ConsOverLoading k2 = new ConsOverLoading(2, "Khushali");
	}

}
