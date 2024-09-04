package com.rays.Comparator;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getId() == s2.getId()) {
			return (s1.getName().compareTo(s2.getName()));
		}
		return (s1.getId() - s2.getId());
	}

}
