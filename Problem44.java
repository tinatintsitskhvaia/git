import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.*;
public class Problem44 extends GraphicsProgram{
	private static final int RADIUS = 40;
	private static final int VY= 5;
	private static final int DELAY = 15;
	private GOval circle;
	public void run() {
		circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		addMouseListeners();
		while (true) {
			circle.move(0,  VY);
			pause(DELAY);
		}
	}
	public void mouseClicked(MouseEvent e) {
		add(circle, e.getX()- RADIUS , e.getY() - RADIUS);
		}
}
