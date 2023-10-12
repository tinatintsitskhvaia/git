import stanford.karel.*;
public class assignment103 extends SuperKarel{
	public void run () {
		fillLikeCheckBoard();
	}
	
	private void fillLikeCheckBoard() {
		fillTheRow();
		while(isThereRow()){
			if (beepersPresent()) {
				move();
				turnLeft();
				if(facingWest()){
					move();
				}else{
					turnAround();
					move();
				}
			}else{
				move();
				turnLeft();
				if(facingEast()){
					turnAround();
				}
			}
			fillTheRow();
		}
	}

	private void fillTheRow() {
		while(frontIsClear()) {
			putBeeper();
			if(frontIsClear()){
				move();
				if(frontIsClear()) move();
			}
		}
	}
	
	private boolean isThereRow() {
		if(facingEast()) {
			turnLeft();
			if(frontIsClear()) {
				return true;
			} else {
				return false;
			}
		} else {
			turnRight();
			if(frontIsClear()) {
				return true;
			} else {
				return false;
			}
		}
		
	}
	
}
