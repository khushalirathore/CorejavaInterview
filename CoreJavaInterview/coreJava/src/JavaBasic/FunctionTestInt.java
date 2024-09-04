package JavaBasic;

public class FunctionTestInt {

	public static void main(String[] args) {
		FinctionInt f = new FinctionInt() {

			@Override
			public int sum(int a, int b) {
				// TODO Auto-generated method stub
				return (a + b);
			}
		};
		
		int a = 20;
		int b = 30;
		System.out.println(f.sum(a, b));
	}

}
