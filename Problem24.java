import acm.program.*;
public class Problem24 extends ConsoleProgram {
	public void run() {
		int n = readInt("enter  n ");
		int divNum = 0;
		for(int i = 1; i <= n; i++) {
			if (n%1 ==0){
				divNum +=1;
			}
		}
		println(divNum);
	}

}
