import stanford.karel.*;

public class assignment101 extends SuperKarel {
	public void run (){
		leaveTheHouse();
		pickBeeper();
		turnAround();
		goBackToTheInitialPosition();
	}

	private void leaveTheHouse() {
		while(frontIsClear()) {
			move();
		}
		turnRight();
		move();
		turnLeft();
		move();
	}

	private void goBackToTheInitialPosition() {
		move();
		turnRight();
		move();
		turnLeft();
		while( frontIsClear()) {
			move();
		}
	}
}