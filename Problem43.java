import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.*;

public class Problem43 extends GraphicsProgram {
	private GObject lastPressedObject;
	private int prevX;
	private int prevY;
	private static final int RADIUS = 25;

	public void run() {
		GOval circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		add(circle, getWidth() / 2 - RADIUS, getHeight() / 2 - RADIUS);
		addMouseListeners();
	}

	public void mousePressed(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		lastPressedObject = obj;
		if (obj != null) {
			prevX = e.getX();
			prevY = e.getY();

		}

	}

	public void mouseDragged(MouseEvent e) {
		if (lastPressedObject != null) {
			lastPressedObject.move(e.getX() - prevX, e.getY() - prevY);
			prevX = e.getX();
			prevY = e.getY();
		}
	}
}
