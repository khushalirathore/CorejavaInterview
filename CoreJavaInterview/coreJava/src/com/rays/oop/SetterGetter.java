package com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SetterGetter {

	public int id;
	public String fName;
	public String lName;
	public Date dob;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public static void main(String[] args) throws ParseException {
		SetterGetter s = new SetterGetter();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		// Test the setter methods
		s.setId(1);
		s.setfName("John");
		s.setlName("Doe");
		s.setDob(sdf.parse("2000-01-01"));

		// Test the getter methods and print the values
		System.out.println("ID: " + s.getId());
		System.out.println("First Name: " + s.getfName());
		System.out.println("Last Name: " + s.getlName());
		System.out.println("Date of Birth: " + s.getDob());
	}
}
