import acm.program.ConsoleProgram;
public class Problem17 extends ConsoleProgram{
	public void run() {
		calculate();
	}

	private void calculate() {
		double num = readDouble("Enter real number: ");
		int integerPart = (int)num;
		double fractionPart = num - integerPart;
		
		println("integer part: " + integerPart);
		println("fraction part: " + fractionPart);
		
	}

}
