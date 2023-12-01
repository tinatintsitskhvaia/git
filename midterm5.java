import acm.program.*;
public class midterm5 extends ConsoleProgram  {
	public void run() {
		println(unEvilText("Hoyyw aaare yoxzzxu"));
		
	}

	private String unEvilText(String text) {
		StringBuilder sb = new StringBuilder();
		while(true){
			for(int i = 0; i< text.length()-1; i++) {
				if(text.charAt(i) !=text.charAt(i+1)) {
					sb.append(text.charAt(i));
				}
			}
		}
		sb.append(text.charAt());
		return sb.toString();
	}

}
