package com.rays.WithoutConst;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

	public int id;
	public String firstName;
	public String lastName;
	public Date dob;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public static void main(String[] args) throws ParseException {
		Person s = new Person();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		s.setId(1);
		s.setFirstName("khushali");
		s.setLastName("rathore");
		s.setDob(sdf.parse("2002-11-01"));

		System.out.println(s.getId());
		System.out.println(s.getFirstName());
		System.out.println(s.getLastName());
		System.out.println(s.getDob());

	}

}
