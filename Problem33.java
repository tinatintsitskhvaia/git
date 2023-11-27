import java.awt.Color;

import acm.graphics.GOval;
import acm.program.*;
import acm.util.RandomGenerator;
public class Problem33 extends GraphicsProgram{
	private static final int MIN_RADIUS = 5;
	private static final int MAX_RADIUS = 40;
		private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		addRandomCircle();
		
		
	}

	private void addRandomCircle() {
	 int r = rgen.nextInt(MIN_RADIUS, MAX_RADIUS);
	 double x = rgen.nextDouble(0 , getWidth() - 2*r);
	 double y = rgen.nextDouble(0 , getHeight() - 2*r);
	 Color color = rgen.nextColor();
	 
	 GOval wre = new GOval( 2*r, 2*r ); 
	 wre.setFilled(true);
	 wre.setColor(color);
	 
	 add(wre, x, y);
	}

}
