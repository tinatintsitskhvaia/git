import acm.program.*;

public class Problem31 extends ConsoleProgram {
	public void run() {
		int n = readInt("enter n: ");

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				println(" n is not prime");
			}
		}
        
	}

}
