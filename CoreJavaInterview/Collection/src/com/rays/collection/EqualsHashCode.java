package com.rays.collection;

public class EqualsHashCode {

	public String name;
	public Integer rollNo;
	public Integer marks;

	public EqualsHashCode(String name, Integer rallNo, Integer marks) {
		this.name = name;
		this.marks = marks;
		this.rollNo = rallNo;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof EqualsHashCode)) {
			return false;

		}
		EqualsHashCode m = (EqualsHashCode) obj;

		boolean b = name.equals(m.name) && rollNo.equals(m.rollNo) && marks.equals(m.marks);

		return b;

	}

	@Override
	public int hashCode() {
		String key = name + rollNo + marks;
		return key.hashCode();
	}

}