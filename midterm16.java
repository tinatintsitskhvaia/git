import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.*;
public class midterm16 extends GraphicsProgram{
	private static final double GOB_D = 50;
	private boolean isOval;
	private int x;
	public void init() {
		isOval = true;
		addMouseListeners();
		
	}
	public void mousePressed (MouseEvent e) {
		x = e.getX();
	}
	
	public void mouseClicked(MouseEvent e) {
		GObject obj;
		if(isOval) {
			obj = new GOval (GOB_D, GOB_D);
		}else {
			obj = new GRect( GOB_D, GOB_D);
		}
		double x = e.getX() - GOB_D /2;
		double y = e.getY() - GOB_D / 2;
		add(obj, x, y);
	}
	public void mouseDragged(MouseEvent e) {
		isOval = (x - e.getX() > 0) ;
	}
}
