import acm.program.*;
public class midterm6 extends ConsoleProgram {
	public void run() {
		String s =" how arxzzxe youuunn";
		println(unEvilText(s));
	}

	private String unEvilText(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);
			if( i < s.length()- 1 && curr == s.charAt(i + 1)){
				i++;
			}else{
				result += curr;
			}
		}
		
		return result;
	}

}
