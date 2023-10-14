import stanford.karel.SuperKarel;

public class problem06 extends SuperKarel {
	public void run() {
		move();
		moveFirstPileToDestinationAndBackUp();
		move();
		moveSecondPileToDestinationAndBackUp();
		restoreBeepers();
		turnAround();
		move();
		turnAround();
		restoreBeepers();
	}

	private void restoreBeepers() {
		turnLeft();
		move();
		turnAround();
		while(beepersPresent()) {
			pickBeeper();
			putBeeperOneCellAway();
		}
		move();
		turnLeft();
	}
		
		
	private void backUpBeeper() {
		turnLeft();
		move();
		putBeeper();
		turnAround();
		move();
		turnLeft();		
	}

	private void putBeeperTwoCellsAway() {
		move();
		move();
		putBeeper();
		turnAround();
		move();
		move();
		turnAround();
	}

	private void moveSecondPileToDestinationAndBackUp() {
		while(beepersPresent()) {
			pickBeeper();
			putBeeperOneCellAway();
			backUpBeeper();	
		}
		
	}

	private void putBeeperOneCellAway() {
		move();
		putBeeper();
		turnAround();
		move();
		turnAround();	
	}

	private void moveFirstPileToDestinationAndBackUp() {
		while(beepersPresent()) {
			pickBeeper();
			putBeeperTwoCellsAway();
			backUpBeeper();
		}
		
	}   
}
