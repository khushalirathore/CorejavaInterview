package com.rays.Comparator;

import java.util.Comparator;

public class SortByIdMarksName implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getId() == s2.getId() && s1.getName() == s2.getName()) {
			return s2.getMarks() - s1.getMarks();
		} else if (s1.getId() == s2.getId()) {
			return (s1.getName().compareTo(s2.getName()));
		}
		return s1.getId() - s2.getId();
	}

}
