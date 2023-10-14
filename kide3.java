import stanford.karel.*;
public class kide3 extends SuperKarel{
	public void run() {
		fillLine();
		returnBack();
		turnAround();
		fillTheVerticalLine();
		while(frontIsClear()){
			move();
			fillTheVerticalLine();
		}
	}

	private void fillTheVerticalLine() {
		turnLeft();
		while(frontIsClear()){
			if(beepersPresent()){
				while(frontIsClear()){
					if(frontIsClear()){
						move();
						if(frontIsClear()){
							move();
							putBeeper();
							
						}
						}
					}
			}else{
				while(frontIsClear()){
					if(frontIsClear()){
						move();
						fillLine();
					}
				}
			}
		}
		returnBack();
		turnLeft();
		
	}

	private void returnBack() {
		turnAround();
		while(frontIsClear()){
			move();
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

