import stanford.karel.*;
public class assignment103 extends SuperKarel{
	public void run () {
		if(frontIsClear()){
			while(frontIsClear()){
				fillLine();
			}
		}else{
			goBack();
			}
		}
	private void goBack() {
		turnAround();
		while(frontIsClear()){
			move();
		}
		move();
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