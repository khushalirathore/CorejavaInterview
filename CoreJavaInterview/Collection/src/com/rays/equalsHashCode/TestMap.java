package com.rays.equalsHashCode;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "ram", 100);
		Employee e2 = new Employee(102, "ramss", 100000);
		Employee e3 = new Employee(101, "ram", 1000);

		Map employeeMap = new HashMap<>();

		employeeMap.put(1, e1);
		employeeMap.put(2, e2);
		
		System.out.println(employeeMap);
		
		employeeMap.remove(1, e3);
		
		System.out.println(employeeMap);

	}
}
