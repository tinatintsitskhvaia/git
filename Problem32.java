import acm.program.*;
public class Problem32 extends ConsoleProgram {
	public void run() {
		for (int i = 0; i <1000000; i ++) {
			if ( isPrime(i)) {
				println(i);
			}
		}
	}

	private boolean isPrime(int i) {
		double sqrt = Math.sqrt(i);
		for (int j = 2; j <= sqrt; j++) {
			if( i % j == 0 ) {
				return false;
			}
		}
		return true;
	}

}
