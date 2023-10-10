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
		while(frontIsClear()){
			putBeeper();
			move();
			move();
		}
		
	}
}
