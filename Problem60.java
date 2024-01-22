import java.util.ArrayList;

import acm.program.*;

public class Problem60 extends ConsoleProgram {
	public void run() {
		while (true) {
			int n = readInt("enter number: ");
			if (n == -1) {
				break;
			}
			enteredNums.add(n);

		}
		for(int i =enteredNums.size(); i>=0; i--) {
			println(enteredNums.get(i));
			
			
		}

	}

	

	ArrayList<Integer> enteredNums = new ArrayList<Integer>();

}
