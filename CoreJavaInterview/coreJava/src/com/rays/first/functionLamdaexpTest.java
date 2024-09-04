package com.rays.first;

public class functionLamdaexpTest {

	public static void main(String[] args) {
		FunctionInt f = (a, b) -> {
			return a + b;
		};

		int a = 10;
		int b = 20;
		System.out.println(f.sum(a, b));
		f.sub(a, b);
		FunctionInt.multi(a, b);

	}

}
