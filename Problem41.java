import acm.graphics.GOval;
import acm.program.*;
import java.awt.event.MouseEvent;
public class Problem41  extends GraphicsProgram{
	private static final int RADIUS = 30;
	
	public void run() {
		addMouseListeners();
	}
	public void mouseDragged(MouseEvent e) {
		paintCircle(e.getX(), e.getY());
	}
	
	public void mousePressed(MouseEvent e) {
		paintCircle(e.getX(), e.getY());
	}

	private void paintCircle(double x, double y) {
		GOval circle = new GOval (2 * RADIUS, 2* RADIUS);
		circle.setFilled(true);
		add(circle, x - RADIUS, y - RADIUS );
		
	}

	
}
