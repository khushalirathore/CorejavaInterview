package com.rays.equalsHashCode;

import java.util.HashMap;

public class TestEqualsAndHashCode {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "khushali", 1000);

		Employee e2 = new Employee(1, "khushali", 1000);

		// Employee e3 = null;

		// String s = "abc";
 
		System.out.println(e1.equals(e2));

		System.out.println(e1.hashCode());

		System.out.println(e2.hashCode());
	}

}
