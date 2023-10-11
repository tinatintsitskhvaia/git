import stanford.karel.*;
public class assignment104  extends SuperKarel{
	public void run() {
		fillLine();
	}

	private void fillLine() {
		while(frontIsClear()){
			putBeeper();
			if(frontIsClear()){
				move();
				if(frontIsClear()){
					move();
				}
			}
		}
		
	}

}
