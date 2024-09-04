package JavaBasic;

import javax.sound.midi.Soundbank;

@FunctionalInterface
public interface FinctionInt {

	public int sum(int a, int b);

	// static method
	public static void multi(int a, int b) {
		System.out.println("Multi : " + (a * b));
	}

	public default void sub(int a, int b) {

		System.out.println("Sub : " + (a - b));
	}

}
