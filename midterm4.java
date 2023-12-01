import acm.program.*;

public class midterm4 extends ConsoleProgram {
	int d;

	public void run() {
		int n = readInt("n  ");
		int m = readInt("m  ");
		if (n == -1 || m == -1) {
			println("paka");
		} else {
			d = m - n;
		}
		while (true) {
			int k = readInt("k ");
			if (k != -1 && k - m == d) {
				m = k;
			}

		}
	}

}
