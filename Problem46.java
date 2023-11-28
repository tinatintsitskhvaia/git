import acm.program.*;

public class Problem46 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text:");
		println("frequent symbol is"  + frequentSymbol(text));
	
	}

	private char frequentSymbol(String text) {
		int maxCharCount = 0;
		char frequentChar = 0;
		for ( int i = 0; i < text.length(); i++) {
			int currCount = countSymbol(text, text.charAt(i));
			if(currCount > maxCharCount) {
				maxCharCount = currCount;
				frequentChar = text.charAt(i);
			}
		
		}
		
		return  frequentChar;
	}

	private int countSymbol(String text, char symbol) {
		int symbolCount = 0;
		for( int i = 0; i< text.length(); i++) {
			if(text.charAt(i) == symbol) {
				symbolCount++;
			}
		}
		return symbolCount;
	}
}
