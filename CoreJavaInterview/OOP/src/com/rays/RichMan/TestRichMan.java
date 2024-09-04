package com.rays.RichMan;

public class TestRichMan {
	public static void main(String[] args) {

		RichMan[] r = new RichMan[2];

		r[0] = new BussinessMan();
		r[1] = new Student();

		r[0].donationg(1000);
		r[1].donationg(500);

	}

}