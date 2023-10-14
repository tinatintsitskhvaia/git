import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.graphics.GLine;
public class Graphic12  extends GraphicsProgram {
	private static final double PI = 3.14;
	private static final double HOUSE_WIDTH = 200;
	private static final double HOUSE_HEIGHT = 300;
	private static final double DOOR_WIDTH = 40;
	private static final double DOOR_HEIGHT = 60;
	private static final double ROOF_HEIGHT = 
	public void run() {
		drawMidLine();
		drawHouse();
	}
	private void drawHouse() {
		drawWall();
		drawRoof();
		drawDoor();
		drawWindows();
		
	}
	private void drawWindows() {
		// TODO Auto-generated method stub
		
	}
	private void drawDoor() {
		// TODO Auto-generated method stub
		
	}
	private void drawRoof() {
		double x1 = (int) (getWidth()/2 - HOUSE_WIDTH / 2) ;
		double y1 = getHeight() - HOUSE_HEIGHT;
		double x2 = x1 + HOUSE_WIDTH / 2 ;
		double y2 = y1 - ROOF_HEIGHT;
		
	}
	private void drawWall(); {
		GRect wall = new GRect(HOUSE_WIDTH,HOUSE_HEIGHT);
		int x = (int) (getWidth()/ 2 - HOUSE_WIDTH/2);
		double y = getHeight() - HOUSE_WIDTH;
		add(wall, x, y );
		
	}
	

	private void drawMidLine() {
		double x1 = 0;
		double y1 = getHeight()/2;
	    double x2 = getWidth();
	    double y2 = y1;
		GLine line = new GLine( x1, y1, x2, y2);
		add (line);
	}
}
