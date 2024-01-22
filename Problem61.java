import java.util.ArrayList;

import acm.program.*;
public class Problem61 extends ConsoleProgram{
	public void run() {
		int m = readInt("m, jami rac unda iyos bro: ");
		int n = readInt("n, ramdeni ricxvic unda sheiyvano: ");
		
		
		for(int i =0; i< n; i++) {
			int k = readInt("num" );
			ricxvebi.add(k);
		}
		for (int i =0; i < ricxvebi.size(); i++){
			for(int j =i+1; j< ricxvebi.size(); j++) {
				int x = ricxvebi.get(i);
				int y = ricxvebi.get(j);
				if(x + y == m) {
					println(" those numbers are "+ x+ " and " +y);
				}
						
			}
		}
		
		
		
	}
ArrayList<Integer> ricxvebi = new ArrayList<Integer>();
}
