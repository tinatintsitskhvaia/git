import stanford.karel.*;
public class assignment103 extends SuperKarel{
	public void run() {
		while(leftIsClear()){
			fillLine();
			moveToTheNextLine();
		}
	}

	private void moveToTheNextLine() {
		turnLeft();
		move();
		turnLeft();	
	}

	private void fillLine() {
		turnLeft();
		while(frontIsClear()){
			if(beepersPresent()){
				move();
			}else{
				putBeeper();
				move();
			}
			if(noBeepersPresent()){
				putBeeper();
			}
		}
		
		
	}
}
