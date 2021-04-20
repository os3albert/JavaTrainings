import java.util.Scanner;

public class SyllableCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a sentence ending in a period");
		
		String input;
		do {
			input = in.next();
			Word w = new Word(input);
			int syllables = w.countSyllables();
			System.out.println("Syllables in " + input + ": " + syllables);
		}
		while (!input.endsWith("."));
	}

}
