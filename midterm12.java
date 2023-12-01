import acm.program.*;
public class midterm12 extends ConsoleProgram{
	public void run() {
		int n = readInt();
		if(isPalindrome(n)) {
			println("is palindrome");
		}
	}

	private boolean isPalindrome(int n) {
		if(n <10) {
			return true;
		}
		if(n %10 == 0) {
			return false;
		}
		int b = n;
		int c= 0;
		while( b!= 0) {
			int lastDigit = b%10;
			b= b/10;
			c= c*10 + lastDigit;
		}
		return n==c;
	}

}
