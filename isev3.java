import stanford.karel.*;
public class isev3 extends SuperKarel{
	
	//es meotxea
	public void run() {
		getToTheUpMiddle();
	    //getDown();
		//putBeeper();
		
		
	}
   // private void getDown() {
		//turnAround();
		//while(frontIsClear()){
			//move();
		//}
		
	//}

	private void getToTheUpMiddle() {
		while(frontIsClear()){
			move();
			turnLeft();
			if(frontIsClear()){
				move();
				if(frontIsClear()){
					move();
				}
		}
			turnRight();
		}
	}
}
		
	
		
	

