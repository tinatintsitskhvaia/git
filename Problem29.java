import acm.program.*;

public class Problem29 extends ConsoleProgram{
	public void run() {
		int n = readInt("enter n:  ");
		int fibN = getFib(n);
		}

	private int getFib(int n) {
		int a1 = 0;
		int a2 = 1;
		for (int i = 2; i < n ; i++) {
			int sum = a1+ a2;
			a1 = a2;
			a2 = sum;
		}
		return a2;
	}

}
