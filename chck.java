import stanford.karel.*;

public class chck extends SuperKarel {

	public void run () {
/* Makes Karel place beepers in the checkerboard pattern
 * pre: karel is at 1x1 , facing east
 * post: karel is at the end of first row , facing east
 */
		fillLine();
		returnBack();
		turnAround();
		fillTheVerticalLine();
		while(frontIsClear()) {
			move();
			fillTheVerticalLine();
		}
	}
	
	/* after filling the first row and returning back to initial position , karel starts to fill columns in a checkerboard pattern 
	 * depending on whether there is beeper at the first box of column
	 */
	private void fillTheVerticalLine() {
		turnLeft();
		while(frontIsClear()) {
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
				while(frontIsClear()) {
					if(frontIsClear()) {
						move();
						fillLine();
					}
				}	
			}
		}	
	}
	
	/* after filling the first row , karel goes back to 1x1,  karel is facing west
	 */
	private void returnBack() {
		turnAround();
		while(frontIsClear()) {
			move();
		}
	}
	
	/*makes Karel fill the first row in a checkerboard pattern
	 */
	private void fillLine() {
		putBeeper();
		while(frontIsClear()) {
			if(frontIsClear()) {
				move();
				if(frontIsClear()) {
					move();
					putBeeper();
				}
			}
		}
	}
}


}
