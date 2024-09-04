package JavaBasic;

public class FunctionIntLemdaexp {

	public static void main(String[] args) {
		FinctionInt f = (a, b) -> {
			return a + b;
		};

		int a = 10;
		int b = 20;
		System.out.println(f.sum(a, b));
		f.sub(a, b);
		FinctionInt.multi(a, b);

	}

}
