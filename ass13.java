import stanford.karel.SuperKarel;
public class ass13 extends SuperKarel{
	public void run(){
		fillTheRow();
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