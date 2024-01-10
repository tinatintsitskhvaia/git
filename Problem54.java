import java.util.Arrays;

import acm.program.*;
public class Problem54 extends ConsoleProgram{ 
	public void run() {
		int n = readInt("enter amount: ");
		int[] arr = new int[n];
		enterNumbers(arr);
		findTwoMaxNums(arr);
	}

	private void findTwoMaxNums(int[] arr) {
		Arrays.sort(arr);
		int max1 = arr.length-1;
		int max2 = arr.length-2;
		
		println("biggest number is " + arr[max1]);
		println("second biggest number is " + arr[max2]);
	}

	private void enterNumbers(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i]= readInt("enter number: ");
		}
	}

}
