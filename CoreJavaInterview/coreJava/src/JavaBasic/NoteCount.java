package JavaBasic;

public class NoteCount {

	public static void main(String[] args) {

		int[] notes = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		int count = 0;
		int rupe = 4500;

		for (int i = 0; i < notes.length; i++) {
			// System.out.println("<i= >" + i);

			count = rupe / notes[i];
			// System.out.println("<count= >"+ count);

			if (count > 0) {

				System.out.println(notes[i] + "=" + count);
				// System.out.println("<note =>"+ notes[i]+ " "+ count);

			}
			rupe = rupe % notes[i];
	

		}

	}

}
