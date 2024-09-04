package com.rays.Comparable;

public class Stud implements Comparable<Stud> {

	public int id;
	public int rollNo;

	public Stud(int id, int rollNo) {
		this.id = id;
		this.rollNo = rollNo;
	}

	public int compareTo(Stud o) {

		if (id == o.id) {

			return o.rollNo - rollNo;

//		} else if (name.equals(o.name)) {
//
//			return Integer.compare(marks, o.marks);
//
		}
		return o.id - id;
	}

	@Override
	public String toString() {
		return id + " " + rollNo;
	}
}
