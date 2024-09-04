package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class SliptFileE {
	public static void main(String[] args) throws Exception {

		int count = 0;

		FileReader fileReader = new FileReader("E://A1.txt");

		Scanner sc = new Scanner(fileReader);

		while (sc.hasNext()) {
			sc.nextLine();
			count++;
		}

		System.out.println("Lines in the file: " + count);

		int numberOfFiles = 0;

		numberOfFiles = (count + 1) / 2;

		System.out.println("Number of files to be generated : " + numberOfFiles);

		BufferedReader br = new BufferedReader(fileReader);

		for (int i = 1; i <= numberOfFiles; i++) {

			FileWriter fileWriter = new FileWriter("E://A2.txt" + i + ".txt");

			PrintWriter out = new PrintWriter(fileWriter);

			for (int j = 1; j <= 2; j++) {

				String line = br.readLine();

				if (line != null) {

					out.println(line);

				}
			}
			out.close();
		}
		fileReader.close();
	}
}