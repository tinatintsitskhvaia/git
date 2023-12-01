import acm.program.*;
public class midterm2 extends ConsoleProgram{
	public void run() {
		String text = readLine("enter text to compress: ");
		println("Compressed version of the string is: " + compressedString);
	}
	int count = 1;
	String compressedString = ("");
	private String longestRunCompress(String text) {
		for( int i = 0; i < text.length(); i ++) {
			while(text.charAt(i) == text.charAt(i +1)) {
				count++;				
			}
			compressedString = compressedString + count + text.charAt(i);
			count = 0;
		}
		return compressedString;
	} 

}
