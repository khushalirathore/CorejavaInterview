package com.rays.overLoading;

public class MethodOverLoading {

	public void move(int num) {
		System.out.println("first number " + num);

	}
	public void move (int num , int num1) {
		
		System.out.println(num + num1);
	}

	public static void main(String[] args) {
		MethodOverLoading m = new MethodOverLoading();
		
		m.move(10);
		m.move(10 ,20);
	}
}
