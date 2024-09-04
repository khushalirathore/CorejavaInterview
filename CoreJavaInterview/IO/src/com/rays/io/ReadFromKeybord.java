package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromKeybord {

	public static void main(String[] args) throws Exception {

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);

		BufferedWriter wr = new BufferedWriter(new FileWriter("E://A1.txt"));

		String line = br.readLine();
		while (!line.equals("abc")) {
			wr.write(line);
			line = br.readLine();
		}
		br.close();
		wr.close();

	}

}
