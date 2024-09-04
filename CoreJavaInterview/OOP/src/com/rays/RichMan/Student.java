package com.rays.RichMan;

public class Student implements RichMan {
	public int amount = 1000;

	@Override
	public void donationg(int i) {

		System.out.println("Total Amount Of Student : " + amount);

		System.out.println("Donation Amount Of Student : " + i);

		int a = amount - i;

		System.out.println("Remain Amount After Student Donation : " + a);
	}

}