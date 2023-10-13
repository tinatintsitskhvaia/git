import stanford.karel.SuperKarel;
public class ass13 extends SuperKarel{
	public void run(){
		fillTheRow();
		goBack();
		while(rightIsClear()){
			fillVerticalRow();
		}
		}
	private void fillVerticalRow() {
		turnRight();
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
		turnAround();
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