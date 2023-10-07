import stanford.karel.*;
public class problem07 extends Karel{
	public void run() {
		while(notFacingNorth()){
			fillLine();
			moveToNextLineIfPossible();
		}
	}

	private void moveToNextLineIfPossible() {
		if(facingEast()&& leftIsClear()) {
			turnLeft();
			move();
			turnLeft();
		}else if(facingWest() && rightIsClear()){
			turnRight();
			move();
			turnRight();
		}else {
			while(notFacingNorth()){
				turnLeft();
			}
		}
		
	}

	private void turnRight() {
		for(int i = 0; i < 3; i++){
			turnLeft();
		}
	}

	private void fillLine() {
		while(frontIsClear()){
			if(noBeepersPresent()){
				putBeeper();
			}
			move();
		}
		if(noBeepersPresent()){
			putBeeper();
		}
	}

}
