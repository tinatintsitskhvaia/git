import java.util.Arrays;

import acm.program.*;
public class Problem56 extends ConsoleProgram{
	public void run() {
		int n = readInt("enter amount");
		int[] arr = new int[n];
		for (int i =0; i < arr.length; i++) {
			arr[i]= readInt("num: ");
		}
		println(Arrays.toString(arr));
		Arrays.sort(arr);
		println("zrdadobis mixedvit aris: ");
		println(Arrays.toString(arr));
	}

}
