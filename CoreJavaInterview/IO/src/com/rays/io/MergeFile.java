package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeFile {
	public static void main(String[] args) throws IOException {

		FileWriter pw = new FileWriter("E://A1A2.txt");

		BufferedReader br = new BufferedReader(new FileReader("E://A1.txt"));

		String s1 = br.readLine();

		while (s1 != null) {

			pw.write(s1);

			s1 = br.readLine();

		}
		br.close();

		br = new BufferedReader(new FileReader("E://A2.txt"));

		String s2 = br.readLine();

		while (s2 != null) {

			pw.write(s2);

			s2 = br.readLine();

		}
		br.close();
		pw.close();

		System.out.println("success.......");

	}

}