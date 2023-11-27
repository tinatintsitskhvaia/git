import acm.program.*;
import acm.util.RandomGenerator;
public class Problem37 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		int n = readInt (" enter number 0-36 : ");
		int rouletteResult =rgen.nextInt(0 , 36);
		println("Roulette result is: " + rouletteResult);
		if ( n == rouletteResult) {
			println("you won <3");
		}else {
			println("you lost :(");
		}
		
	}

}
