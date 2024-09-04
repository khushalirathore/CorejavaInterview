package com.rays.Comparable;

public class Student1 implements Comparable<Student1> {

	public int id;
	public int rollNo;
	public String name;
	public int marks;

	public Student1(int rollNo, String name, int marks, int id) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		this.id = id;

	}

	@Override
	public int compareTo(Student1 o) {

		// if (rollNo == o.rollNo) {

		// return name.compareTo(o.name);

		// }
		// else
		if (name.equals(o.name)) {

			return Integer.compare(marks, o.marks);

		} else if (id == o.id) {

			return o.rollNo - rollNo;

		}
		return name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return rollNo + ", name=" + name + ", marks=" + marks + " " + id;
	}
}