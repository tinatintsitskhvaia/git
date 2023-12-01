import acm.program.*;
public class midterm7 extends ConsoleProgram {
	public void run() {
		int n = 0;
		int curr = 0;
		int next = 1;
		boolean  fib = true;
		while(true) {
			n= readInt();
			if(n== -1){
				break;
			}
			println(curr);
			if(fib){
				if(n != curr) {
					fib = false;
				}
				int tmp = curr;
				curr = next;
				next += tmp;
			}
		}
		if(fib) {
			println("fib");
		}else{
			println("not fib");
		}
	}

}
