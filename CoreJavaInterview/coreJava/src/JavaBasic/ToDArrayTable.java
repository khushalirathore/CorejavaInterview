package JavaBasic;

public class ToDArrayTable {
	public static void main(String[] args) {

		int[][] table = new int[10][10];

		for (int i = 0; i < table.length; i++) {
			// System.out.println("<<i== >>" + i);
			for (int j = 0; j < table.length; j++) {
				// System.out.println("<<j==>>" + j);
				table[i][j] = (i + 1) * (j + 1);

				System.out.print(table[i][j] + " \t");

				// System.out.print(i*j + "\t");
			}

			System.out.println();
		}

	}

}