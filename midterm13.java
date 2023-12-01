import acm.program.*;
public class midterm13 extends ConsoleProgram {
	public void run() {
		println(amIYourFatherLuke("CGAT", "CCTGACT"));
	}

	private boolean amIYourFatherLuke(String lukeDNA, String anakinDNA) {
		for( int i = 0; i < lukeDNA.length(); i++) {
			for(int j = i; j <= lukeDNA.length(); j++ ) {
				String currSubStr=lukeDNA.substring(i,j);
				if(anakinDNA.contains(currSubStr) && currSubStr.length() > anakinDNA.length() / 2) {
					return true;
				}
			}
		}
		return false;
	}

}
