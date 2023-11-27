import acm.program.*;
import acm.util.RandomGenerator;
public class Problem38 extends ConsoleProgram{
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		int initialMoney = 1000;
		while (initialMoney > 0) {
			int betMoney = readInt ("bet money is: ");
			int n = readInt(" your number is: ");
			int rouletteResult = rgen.nextInt(0, 36);
			if (n== rouletteResult) {
				initialMoney = initialMoney + betMoney; 
				println(" you won" + betMoney +" dollars, now you have"+ initialMoney + " dollars");
			}else {
				initialMoney = initialMoney - betMoney;
				println(" you lost" + betMoney +" dollars, now you have"+ initialMoney + " dollars");

			}
			
		}
	}

}
