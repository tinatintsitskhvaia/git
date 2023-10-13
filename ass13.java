import stanford.karel.SuperKarel;
public class ass13 extends SuperKarel{
	public void run() {
		while(notFacingNorth()){
			fillTheRow();
			moveToTheNextLineIfPossible();
	}
}
	private void moveToTheNextLineIfPossible() {
		if (facingEast() && leftIsClear()){
			if(noBeepersPresent()){
				turnLeft();
				move();
				turnLeft();
			}else{
				turnLeft();
				move();
				turnLeft();
				move();
			}
		}
		if (facingWest() && rightIsClear()){
			if(noBeepersPresent()){
				turnRight();
				move();
				turnRight();
			}else{
				turnRight();
				move();
				turnRight();
				move();
			}
		}
		
	}

	private void fillTheRow() {
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