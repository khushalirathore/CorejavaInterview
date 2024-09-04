package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFilea {

	public static void main(String[] args) throws IOException {

		String source = "E://sinchan.jpg";
		String target = "E://anshul.jpg";

		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);

		int i = in.read();

		while (i != -1) {

			out.write(i);

			i = in.read();

		}

		out.close();
		System.out.println("sucessfullyy......");

	}

}