import stanford.karel.*;
public class assignment103 extends SuperKarel{
	public void run () {
		if(frontIsClear()){
			while(frontIsClear()){
				fillLine();
			}
		}
		while(frontIsBlocked()){
			goBack();
			}
		}
	private void goBack() {
		turnAround();
		while(frontIsClear()){
			move();
		}
	}
	

	private void fillLine() {
		while(frontIsClear()){
	
		putBeeper();
		if(frontIsClear()){
			move();
			if(frontIsClear()){
				move();
			
		}

		}
		
	}
	}

}