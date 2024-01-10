import java.util.Arrays;

import acm.program.*;

public class Problem55 extends ConsoleProgram {
	public void run() {
		int n = readInt("enter amount:");
		int[] arr = new int[n];
		enterNumbers(arr);
		int[] copy = arr;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == copy[i]) {
				println("is sorted");
			}else{
				println("it is  not sorted");
			}
		}

	}


	private void enterNumbers(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = readInt("enter number");
		}
	}

}
