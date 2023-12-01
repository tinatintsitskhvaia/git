import acm.program.*;
public class midterm1 extends ConsoleProgram { //2016.1.3
	public void run() {
		int n = readInt("n:  ");
		int m = readInt("m: ");
		int k =1;
		int res= 0;
		while(k <= m) {
			res++;
			k*=n;
		}
		println(res);
		
	}
}
