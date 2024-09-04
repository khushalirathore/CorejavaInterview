package com.rays.streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestSecondHigh {
	public static void main(String[] args) { 

		List<SecondHigh> employees = new ArrayList<>();
		employees.add(new SecondHigh("Alice", 50000));
		employees.add(new SecondHigh("Bob", 70000));
		employees.add(new SecondHigh("Charlie", 60000));
		employees.add(new SecondHigh("David", 80000));

		double secondHighestSalary = employees.stream()
				.map(e -> e.getSalary())
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1).findFirst()
				.orElse(0.0);

		System.out.println("Second highest salary: " + secondHighestSalary);
	}
}