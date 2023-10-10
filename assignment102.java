import stanford.karel.*;
public class assignment102 extends SuperKarel{
	public void run() {
		while(frontIsClear()){
			fixTheRow();
			goBack();
			moveToTheNextRow();
			}
		if(frontIsBlocked()) {
			fixTheRow();
		}
		goBack();
	}


	private void moveToTheNextRow() {
		for(int i = 0; i < 4; i++) {
			move();
		}
	}

	private void goBack() {
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnLeft();
	}

	private void fixTheRow() {
		turnLeft();
		while(frontIsClear()) {
			if(noBeepersPresent()){
				putBeeper();
				}else{
					move();
				}
		if(frontIsBlocked() && noBeepersPresent()) {
			putBeeper();
		}
			}
		}
		
	}

