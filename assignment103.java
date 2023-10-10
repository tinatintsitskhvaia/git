import stanford.karel.*;
public class assignment103 extends SuperKarel{
	public void run() {
		while(frontIsClear()){
			fillTheLine();
		}
	}

	private void fillTheLine() {
		while(frontIsClear()){
			putBeeper();
			move();
			move();
		}
		if(frontIsBlocked() && beepersPresent()){
			turnLeft();
		}
		if(frontIsBlocked() && noBeepersPresent()) {
			putBeeper();
			turnLeft();
		}
	}
}

