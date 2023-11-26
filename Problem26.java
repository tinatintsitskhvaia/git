import acm.program.*;
public class Problem26 extends ConsoleProgram{
	public void run() {
		int n = readInt("Enter positive number: ");
		int m = readInt("Enter positive number: ");

		int gcd= gcd(n, m);
		println(gcd);	
		}

	private int gcd(int n, int m) {
		for (int i = Math.min(n, m); i >= 1; i--) {
			if (n % i == 0 && m % 1 == 0) {
				return i;
			}
		}
		return -1;
	}

}
