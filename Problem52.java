import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import acm.program.*;
public class Problem52 extends ConsoleProgram{
	public void run() {
		try{
			BufferedReader reader = new BufferedReader(new FileReader("Practice/Problem52.java"));
			while(true) {
				String nextLine = reader.readLine();
				if(nextLine == null) {
					break;
				}
				println(nextLine);
			}
			reader.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			println("shegeshala broo, eg faili ararsebobs :(");
		}catch(IOException e) {
			e.printStackTrace();
			println("shenshia problema");
		}
	}

}
