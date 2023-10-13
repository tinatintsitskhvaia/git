import stanford.karel.SuperKarel;
public class ass13 extends SuperKarel{
	public void run(){
		fillTheRow();
		goBack();
		fillVerticalRow();
		moveToTheNextVerticalRow();
		}
		
	private void moveToTheNextVerticalRow() {
		turnAround();
		while(frontIsClear()){
			move();
			turnLeft();
			fillVerticalRow();
		}
		
	}

	private void fillVerticalRow() {
		if(beepersPresent()){
			if(frontIsClear()){
				move();
				if(frontIsClear()){
					move();
					fillTheRow();
				}
			}
		}else{
			if(frontIsClear()){
				move();
				fillTheRow();
			}
		}
		goBack();
	}

	private void goBack() {
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnRight();
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