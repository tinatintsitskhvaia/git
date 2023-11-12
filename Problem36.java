import acm.program.*;
import acm.util.RandomGenerator;
public class Problem36 extends ConsoleProgram {
	private static final int NUM_EXPERIMENTS = 1000000;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run () {
		double sumFlips = 0;
		for ( int i = 0; i < NUM_EXPERIMENTS; i++) {
			int currFlips  = holdExperiment();
			sumFlips += currFlips;
		}
		double avgFlips = sumFlips / NUM_EXPERIMENTS;
		println(avgFlips);
	}
	private int holdExperiment() {
		// TODO Auto-generated method stub
		return 0;
	}

}

