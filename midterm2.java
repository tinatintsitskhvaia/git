import acm.program.*;

public class midterm2 extends ConsoleProgram {
	public void run() {
		String s = readLine();
		longestRunCompression(s);
	}

	private void longestRunCompression(String s) {
		int count = 1;
		
		for( int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);
			if(i< s.length() -1 && curr == s.charAt(i +1)) {
				count++;
			}else{
				if(count > 1) {
					print(count);
				}
				print(curr);
				count = 1;
			}
		}
		
	}

}
