import acm.program.*;

public class Problem45 extends ConsoleProgram {
	public void run() {
		String str = readLine("Enter text:");
		String symbolText = readLine("Enter symbol:");
		
		char symbol = symbolText.charAt(0);
		int numbOccurences = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == symbol) {
				numbOccurences++;
			}
		}
		println(numbOccurences);
	}

}
