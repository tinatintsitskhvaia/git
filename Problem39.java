import acm.graphics.GOval;
import acm.program.*;
public class Problem39 extends GraphicsProgram {
	private static final int PAUSE_MS = 5;
	private static final int VEL_X = 3;
	private static final int RADIUS = 25;
	public void run() {
		GOval circle = createCircle();
		int vx = VEL_X;
		int vy = 0;
		
		while(circle.getX() + 2 * RADIUS < getWidth()) {
			circle.move(vx, vy);
			pause(PAUSE_MS);
		}
		
	}
	private GOval createCircle() {
		GOval circle = new GOval( 2* RADIUS, 2*RADIUS);
		circle.setFilled(true);
		double x = 0;
		double y = getHeight() /2 - RADIUS;
		add(circle , x, y);
		return circle;
	}

}
