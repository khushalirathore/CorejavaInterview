package com.rays.Externalization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {
	public static void main(String[] args) throws Exception {

		FileOutputStream file = new FileOutputStream("E://A1.txt");

		ObjectOutputStream out = new ObjectOutputStream(file);

		Employee e = new Employee();

		e.id = 1;
		e.name = "yash";
		e.address = "indore";
		e.salary = 50000;

		out.writeObject(e);

		out.close();
		file.close();

		System.out.println("Object write successfully....!!!");

	}

}   