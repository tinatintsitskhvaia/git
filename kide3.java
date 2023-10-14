import stanford.karel.*;
public class kide3 extends SuperKarel{
	public void run() {
		fillLine();
		returnBack();
		fillTheVerticalLine();
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
		
	}

	private void returnBack() {
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnAround();
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

