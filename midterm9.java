import acm.program.*;

public class midterm9 extends ConsoleProgram {
	public void run() {

		int n = readInt();
		println(getBiggerDivisor(n));

	}

	private int getBiggerDivisor(int n) {
		int x = 2;
		for(int i = 2; i <=n; i++){
			if(n%i ==0){
				if(check(i)) {
					x = i;
				}
			}
		}
		return x;
	}
	
	private boolean check (int i) {
		int count = 0;
		for( int j = 1; j<= i; j++) {
			if(i %j ==0) {
				count++;
			}
		}
		if(count>2) return false;
		return true;
		 
	}
}