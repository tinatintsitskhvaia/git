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
			reversedArray(enteredNums);
		}
		
		for (int i =0; i< reversed.size(); i++) {
			println(reversed.get(i));
		}
	}

	private void reversedArray(ArrayList<Integer> enteredNums) {
		for (int i =enteredNums.size(); i>0; i--) {
			reversed = new ArrayList<Integer>();
			reversed.add(enteredNums.get(i-1));	
		}
	}

	ArrayList<Integer> enteredNums = new ArrayList<Integer>();
	ArrayList<Integer> reversed;

}
