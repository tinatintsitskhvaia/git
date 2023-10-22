import acm.program.ConsoleProgram;
public class Problem16 extends ConsoleProgram{
	public void run() {
		countHarmonic();
	}

	private void countHarmonic() {
		int num1 = readInt("enter first number: ");
		int num2 = readInt("enter second number: ");
		int num3 = readInt("enter third number: ");
		
		double harmonic = 1 /(1 / num1 + 1 / num2 + 1 / num3);
		println("result: " + harmonic);
	}

}
