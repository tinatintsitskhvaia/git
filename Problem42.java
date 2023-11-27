import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.*;
public class Problem42 extends GraphicsProgram{
	private GLine xazi;
	public void run() {
		addMouseListeners();
	}
	public void mousePressed(MouseEvent e) {
		xazi = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
		add(xazi);
		}
	public void mouseDragged (MouseEvent e) {
		xazi.setEndPoint(e.getX(), e.getY());
	}
}
