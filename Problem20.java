import acm.program.*;
public class Problem20 extends ConsoleProgram {
	public void run() {
		int n = readInt( "enter n: ");
		int sum = 0;
		for(int i = 0; i < n ; i++){
			int num =  readInt("enter number #" + i + ":") ;			
			sum += num;
		}
		println("sum: " + sum);
	}
}
