import stanford.karel.*;
public class assignment103 extends SuperKarel{
	public void run () {
		while(notFacingNorth()){
			fillLine();
			moveToTheNextLineIfPossible();
		}
	}

	private void moveToTheNextLineIfPossible() {
		if( facingEast() && leftIsClear()){
			turnLeft();
			move();
			turnLeft();
		}else if( facingWest() && rightIsClear()) {
			turnRight();
			move();
			turnRight();
		}else{
			while(notFacingNorth()) {
				turnLeft();
			}
		}	
	}

	private void fillLine() {
		while(frontIsClear()){
			putBeeper();
			while(frontIsClear()){
				move();
				move();
				putBeeper();
			}
		}
		
	}

}
