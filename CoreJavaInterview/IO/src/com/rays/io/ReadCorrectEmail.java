package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadCorrectEmail {

	public static void main(String[] args) throws Exception {

		FileReader read = new FileReader("E://A1.txt");

		BufferedReader in = new BufferedReader(read);

		FileWriter write = new FileWriter("E://A2.txt");

		PrintWriter out = new PrintWriter(write);

		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		String line = in.readLine();

		while (line != null) {

			if (line.matches(emailreg)) {

				out.print(line);

			}

			line = in.readLine();

		}

		out.close();
		in.close();
		System.out.println("done");

	}

}