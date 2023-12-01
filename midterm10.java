import acm.program.*;
public class midterm10 extends ConsoleProgram {
	public void run() {
		String a = readLine();
		String b = readLine();
		println(sheidzleba(a,b));
		
	}
	private boolean sheidzleba(String a , String b) {
		for( int i = 0; i < b.length(); i++) {
			char curr =b.charAt(i);
			if(Character.isLetter(curr)) {
				int occurA = countOcc(a, curr);
				int occurB = countOcc(b, curr);
				if(occurA >= occurB) {
					return true;
				}
			}
		}
		return false;
		
	}
	private int countOcc(String a, char curr) {
		int count = 0;
		for( int i = 0; i < a.length(); i++) {
			curr = a.charAt(i);
			if(Character.isLetter(curr)) {
				count ++;
			}
		}
		return count;
	}
}
