import acm.program.*;
public class midterm15 extends ConsoleProgram{
	public void run() {
		println(isAnagram("tokyo" , "kyoto"));
	}

	private boolean isAnagram(String st1, String st2) {
		if(st1.length() != st2.length()){
			return false;
		}
		for( int i = 0; i < st1.length(); i++) {
			int index = st2.indexOf(st1.charAt(i));
			if(index == -1) {
				return false;
			}
			st2= st2.substring(0, index) +st2.substring(index+1, st2.length());
		}
		return st2.isEmpty();
	}

}
