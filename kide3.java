import stanford.karel.*;
public class kide3 extends SuperKarel{
	public void run() {
		while(notFacingNorth()){
			fillLine();
			moveToTheNextLineIfPossible();
	}
}
		
	

	private void moveToTheNextLineIfPossible() {
		if(facingEast() && leftIsClear()){
			if(noBeepersPresent()){
				turnLeft();
				move();
				turnLeft();
				fillLine();
			}else{
				turnLeft();
				move();
				turnLeft();
				move();
				fillLine();
			}
		}else if(facingWest() && rightIsClear()){
			if(noBeepersPresent()){
				turnRight();
				move();
				turnRight();
				fillLine();
			}else{
				turnRight();
				move();
				turnRight();
				move();
				fillLine();
			}
		}else{
			while(notFacingNorth()){
				turnLeft();
			}
		}
		
		
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
