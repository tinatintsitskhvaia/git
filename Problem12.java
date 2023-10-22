import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.*;
public class Problem12 extends GraphicsProgram{
	public void run() {
		drawWalls();
		drawRoof();
		drawDoor();
	}

	private void drawRoof() {
		double x1 = getWidth()/ 2 - 150;
		double y1 = getHeight() - 400;
		double x2 = x1 + 150;
		double y2 = y1 - 200;
		 GLine leftRoof = new GLine(x1, y1, x2, y2);
		 add(leftRoof);
		 x1 = x2;
		 y1 = y2;
		 x2 = x1 + 150;
		 y2 = y1 + 200;
		 GLine rightRoof = new GLine( x1, y1, x2, y2);
		 add(rightRoof);
				 
		 
		
	}

	private void drawWalls() {
		GRect houseWalls = new GRect(300, 400);
		int x = (int)( getWidth() / 2 - 150);
		double y = getHeight() - 400;
		add(houseWalls, x, y);
		
		
	}

	private void drawDoor() {
		GRect door = new GRect (60, 100);
		int x =(int)(getWidth() / 2 - 30);
		double y = getHeight() - 100;
		add(door, x, y);
		
	}

		
	}


