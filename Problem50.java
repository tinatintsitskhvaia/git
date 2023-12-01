import java.util.StringTokenizer;

import acm.program.*;
public class Problem50 extends ConsoleProgram{
	public void run() {
		String text = readLine("enter text: ");
		StringTokenizer tokenizer = new StringTokenizer(text);
		int count = 0;
		
		while(tokenizer.hasMoreTokens()) {
			String currToken = tokenizer.nextToken();
			tokenizer.nextToken();
			count ++;
		}
		println("count: "+ count);
	}

}
