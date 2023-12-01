import acm.program.*;

public class midterm5 extends ConsoleProgram {
	public void run() {
		int n = readInt();
		int m = readInt();
		int q = m /n;
		boolean check = true;
		while( n != -1) {
			n = m;
			m = readInt();
			if(m != n* q) {
				if( m == -1) {
					break;
				}
				check = false;
			}
		}
		if (check) {
			println("geometr");
		}else{
			println("net geometr");
		}
	}
	
}