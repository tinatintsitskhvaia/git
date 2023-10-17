import acm.program.ConsoleProgram;
public class Problem18 extends ConsoleProgram {
	public void run () {
		int num1 = readInt ("Enter number: ");
		int num2 = readInt (" Enter number: ");
		
		if( num1 > num2 ){
			println(num1);
		}else{
			println(num2);
		}
			
		
		println(Math.max(num1, num2));
	}

}
