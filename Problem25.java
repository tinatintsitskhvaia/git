import acm.program.*;

public class Problem25 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter positive number:  ");
		int m = readInt("Enter positive number:  ");

		int lcm = lcm(n, m);
		println(lcm);
	}

	private int lcm(int n, int m) {

		return (n * m) / gcd(n, m);
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
