package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadCharByChar {
	public static void main(String[] args) throws IOException {

		FileReader file = new FileReader("E://A1.txt");
		
		BufferedReader br = new BufferedReader(file);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("E://A2.txt"));

		int i = br.read();

		while (i != -1) {
			bw.write(i);

			System.out.print((char) i);

			i = br.read();

		}

		file.close();
		br.close();

	}

}