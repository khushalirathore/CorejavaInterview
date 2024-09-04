package com.rays.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadBinaryFileWithBuffer {
	public static void main(String[] args) throws IOException {

		String source = "E://sinchan.jpg";

		String target = "E://anshul.jpg";

		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(source));

		BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(target));

		int i = bi.read();

		System.out.println(i);

		while (i != -1) {

			bo.write(i);

			i = bi.read();

		}
		System.out.println("sucessfully");
		bo.close();

	}

}