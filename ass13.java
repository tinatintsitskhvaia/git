import stanford.karel.SuperKarel;
public class ass13 extends SuperKarel{
	public void run() {
		while(notFacingNorth()){
			fillTheLine();
			moveToTheNextLineIfPossible();
			
		}
	}
	private void moveToTheNextLineIfPossible() {
		if(facingEast() && leftIsClear()){
			if(beepersPresent()){
				turnLeft();
				move();
				turnLeft();
				move();
				
			}else{
				turnLeft();
				move();
				turnLeft();
			}
		}else if( facingWest() && rightIsClear()){
			if(beepersPresent()){
				turnRight();
				move();
				turnRight();
				move();
			}else{
				turnRight();
				move();
				turnRight();
				
			}
		}
		
	}
	private void fillTheLine() {
		putBeeper();
		if(frontIsClear()){
			move();
			if(frontIsClear()){
				move();
				}
				
			}
		}
		
	}


