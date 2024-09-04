package com.rays.Comparator;

public class Student {

	public int id;
	public String name;
	public int marks;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}
 
	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public String toString() {
		return id + " : " + name + " : " + marks;
	}

}
