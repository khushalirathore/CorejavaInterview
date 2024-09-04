package com.rays.first;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Example12 implements Serializable {
	public void display() {
		System.out.println("Object created using deserialization");
	}

	public static void main(String[] args) {
		try {
			// Serialize the object
			Example12 original = new Example12();
			FileOutputStream fos = new FileOutputStream("example12.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(original);
			oos.close();

			// Deserialize the object
			FileInputStream fis = new FileInputStream("example12.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Example12 deserialized = (Example12) ois.readObject();
			ois.close();

			deserialized.display();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
