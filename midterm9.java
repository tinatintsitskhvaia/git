import acm.program.*;

public class midterm9 extends ConsoleProgram {
	public void run() {

		int n = readInt();

		for (int i = n - 1; i > 1; i--) {
			if (n % i == 0) {
				for (int j = 2; j < i; j++) {
					continue;
				}
				println(i);
			}
			
		}
		
	}
}
