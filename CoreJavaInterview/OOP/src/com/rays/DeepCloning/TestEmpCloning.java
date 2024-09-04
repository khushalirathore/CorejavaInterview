package com.rays.DeepCloning;

public class TestEmpCloning {
	public static void main(String[] args) throws CloneNotSupportedException {

		Address address = new Address("indore", "MP");
		Emp emp1 = new Emp("Khushali", address);

		Emp emp2 = (Emp) emp1.clone();

		emp2.name = "XYZ";
		emp2.add.city = "bhopal";

		System.out.println(emp1.name);
		System.out.println(emp1.add.city);
		System.out.println(emp1.add.state);

		System.out.println();

		System.out.println(emp2.name);
		System.out.println(emp2.add.city);
		System.out.println(emp2.add.state);
	}
}
