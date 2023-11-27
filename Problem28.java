import acm.program.*;
public class Problem28 extends ConsoleProgram {
	private static final int SENTINEL = -1;
	public void run() {
		int numEvens = 0;
		while (true) {
			int n = readInt("enter n: ");
			if (n == SENTINEL) {
				break;
			}
			
			if( n%2 ==0) {
				numEvens +=1;
			}
		}
		println(numEvens);
	}

}
