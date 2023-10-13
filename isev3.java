import stanford.karel.*;
public class isev3 extends SuperKarel{
	
	//es meotxea
	public void run() {
		getToTheUpMiddle();
	    getDown();
		putBeeper();
		
		
	}
   private void getDown() {
       if(facingEast()){
    	   turnRight();
    	   while(frontIsClear()){
    		   move();
    	   }
		}else if(facingNorth()){
			turnRight();
			turnRight();
			while(frontIsClear()){
				move();
			}
		}
		
	}

	private void getToTheUpMiddle() {
		while(frontIsClear()&& leftIsClear()){
			move();
			turnLeft();
			if(frontIsClear()){
				move();
				if(frontIsClear()){
					move();
					turnRight();
				}
			}
		}
	}
}
		
	
		
	

