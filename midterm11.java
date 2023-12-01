import acm.program.*;
import acm.util.RandomGenerator;

public class midterm11 extends ConsoleProgram {
	private static final int NUM_EXPERIMENTS = 1000;
	RandomGenerator rgen = RandomGenerator.getInstance();
	private double n;

	public void run() {
		n = readInt();
		double sumFlips = 0;
		for (int i = 0; i < NUM_EXPERIMENTS; i++) {
			int currFlips = holdExperiment();
			sumFlips += currFlips;
		}
		double avgFlips = sumFlips / NUM_EXPERIMENTS;

	}

	private int holdExperiment() {
		int numFlips = 0;
		while (n != 0) {
				numFlips++;
				boolean isHeads = rgen.nextBoolean();
				if (isHeads) {
					n /= 2;
				} else {
					n--;
				}

			}
		
		return numFlips;
	}

}
