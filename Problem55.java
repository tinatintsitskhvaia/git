import java.util.Arrays;

import acm.program.*;

public class Problem55 extends ConsoleProgram {
	public void run() {
		int n = readInt("enter amount:");
		int[] arr = new int[n];
		enterNumbers(arr);
		int[] copy = arr;
		if(isEqual(copy, arr) ) {
			println("is Sorted");
		}else{ 
			println("it is not sorted");
		}

	}

	private boolean isEqual(int[] copy, int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == copy[i]) {
				return true;
			}
		}
		return false;

	}

	private void enterNumbers(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = readInt("enter number");
		}
	}

}
