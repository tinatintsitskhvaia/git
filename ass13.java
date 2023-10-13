import stanford.karel.SuperKarel;
public class ass13 extends SuperKarel{
	public void run(){
		fillTheRow();
		goBack();
}

	private void goBack() {
		turnAround();
		while(frontIsClear()){
			move();
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
		
	}
}