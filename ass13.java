import stanford.karel.SuperKarel;
public class ass13 extends SuperKarel{
	public void run(){
		fillTheRow();
		while(leftIsClear()){
			fillTheVerticalRow();
			if(frontIsClear()){
				move();
			}
		}
	}

		
		
		
	private void fillTheVerticalRow() {
		turnLeft();
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
				move();
				putBeeper();
				if(frontIsClear()){
					move();
					
				}
			}
		}
		
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
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnAround();
}
}