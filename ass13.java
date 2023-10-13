import stanford.karel.SuperKarel;
public class ass13 extends SuperKarel{
	public void run() {
		fillCheckBoard();
			
		}

	private void fillCheckBoard() {
		fillTwoRows();
		while(frontIsClear()){
			move();
			if(frontIsClear()){
				turnRight();
				fillTwoRows();
			}else{
				turnRight();
				fillRow();
			}
		}
		
	}

	private void fillRow() {
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

	private void fillTwoRows() {
		fillRow();
		if(beepersPresent()){
			turnLeft();
			move();
			turnLeft();
			if(frontIsClear()){
				move();
			}
			fillRow();
		}else{
			turnLeft();
			move();
			turnLeft();
			fillRow();
		}
		turnRight();
	}
	}
