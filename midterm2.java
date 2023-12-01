import acm.program.*;

public class midterm2 extends ConsoleProgram {
	public void run() {
		String text = readLine("enter text to compress: ");
		String result = longestRunCompression(text);
		println(result);
	}

	private String longestRunCompression(String text) {
		if (text == null) {
			return "please enter text";
		}

		StringBuilder result = new StringBuilder();
		char currChar = text.charAt(0);
		int count = 1;
		for( int i = 1; i < text.length() ; i++){
			char nextChar = text.charAt(i);
			if (nextChar==currChar) {
				count ++;
			}else{
				result.append(count).append(text.charAt(i));
				currChar = nextChar;
				count = 1;
			}
		}
		result.append(count).append(currChar);
		return result.toString();
	}

}
