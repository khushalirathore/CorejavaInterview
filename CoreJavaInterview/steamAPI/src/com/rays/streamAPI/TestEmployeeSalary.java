package com.rays.streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestEmployeeSalary {

	public static void main(String[] args) {

		List<EmployeeSalary> list = new ArrayList<>();

		list.add(new EmployeeSalary(20000, "Anshul"));
		list.add(new EmployeeSalary(25000, "Rakesh"));
		list.add(new EmployeeSalary(1000, "Sunil"));
		list.add(new EmployeeSalary(522, "Naman"));
		list.add(new EmployeeSalary(600, "Sunny"));

		list.stream().distinct().filter(c -> c.getSalary() >= 20000)
				.forEach(c -> System.out.println(c.getSalary() + "=" + c.getName()));

	}

}