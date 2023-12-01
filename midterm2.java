import acm.program.*;

public class midterm2 extends ConsoleProgram {
	public void run() {
		String text = readLine("enter text to compress: ");
		String result = longestRunCompression(text);
	}

	private String longestRunCompression(String text) {
		if (text == null) {
			return "please enter text";
		}

		StringBuilder result = new StringBuilder();
		int count = 1;
		for( int i = 0; i < text.length() - 1 ; i++){
			if (text.charAt(i) == text.charAt(i +1)) {
				count ++;
			}else{
				result.append(count).append(text.charAt(i));
				count = 1;
			}
		}
				
		return result.toString();
	}

}
