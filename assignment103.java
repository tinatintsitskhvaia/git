import stanford.karel.*;
public class assignment103 extends SuperKarel{
	public void run () {
		if(frontIsClear()){
			while(frontIsClear()){
				fillLine();
			}
		}else{
			turnLeft();
			while(frontIsClear()){
				fillLine();
			}
		}
	}
	

	private void moveToTheNextLineIfPossible() {
		if( facingEast() && leftIsClear()){
			turnLeft();
			move();
			turnLeft();
		}else{
			if( facingWest() && rightIsClear()) {
			turnRight();
			move();
			turnRight();
		
			}
		}	
	}

	private void fillLine() {
		putBeeper();
		if(frontIsClear()){
			move();
			if(frontIsClear()){
				move();
			}else{
				moveToTheNextLineIfPossible();
			}
		}else{
			moveToTheNextLineIfPossible();
		}

			
		
	}
}

