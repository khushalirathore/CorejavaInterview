package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFileLineByLine {
	public static void main(String[] args) throws IOException {

		FileReader reader = new FileReader("E://A1A2.txt");

		BufferedReader    br = new BufferedReader(reader);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("E://A1.txt" , true));

		String str = br.readLine();

		while (str != null) {

			System.out.println(str);

			bw.write(str);
			str = br.readLine();

		}
		reader.close();
		br.close();

	}

}