import stanford.karel.*;
public class kide3 extends SuperKarel{
	public void run() {
			fillLine();
	}

		
	

	private void fillLine() {
		putBeeper();
		while(frontIsClear()){
			if(frontIsClear()){
				move();
				if(frontIsClear()){
					move();
					putBeeper();
				}
			}
		}
		
	}

}
