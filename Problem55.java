import java.util.Arrays;

import acm.program.*;

public class Problem55 extends ConsoleProgram {
	public void run() {
		int n = readInt("enter amount:");
		int[] arr = new int[n];
		enterNumbers(arr);
		int[] copy = arr;
		println(isEqual(copy, arr));

	}


	private boolean isEqual(int[] copy, int[] arr) {
		Arrays.sort(arr);
		System.out.println("something");
		for(int i =0; i <arr.length; i++) {
			System.out.println(arr[i] + "arr");
			System.out.println(copy[i] + "copy");
			if(arr[i] != copy[i]) {
				System.out.println("shevida if shi");
				return false;
			}
		}
		return true;
		
	}


	private void enterNumbers(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = readInt("enter number");
		}
	}

}
