import acm.program.*;
public class Problem27 extends ConsoleProgram {
	public void run() {
		int n = readInt("enter positive num");
		int m = readInt("enter positive num");
		
		int nPowM = pow(n,m);
		println(nPowM);
	}

	private int pow(int n, int m) {
		int res = 1;
		for( int i = 0 ; i < m; i++){
			res *= n;
		}
		return res;
	}

}
