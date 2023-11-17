import acm.program.*;

public class Problem46 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text:");
		int maxCount = 0;
		char maxChar;
		for (int i = 0; i< text.length(); i++) {
		}
		
		
	}
	private int numOccurences (String text, char symbol) {
		int numOccurences = 0;
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == symbol) {
				numOccurences++;
			}
	}
		return numOccurences;
	}
}
