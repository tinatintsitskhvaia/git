import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;

public class midterm3 extends GraphicsProgram {
	private static final int CIRCLE_D = 40;
	private RandomGenerator rgen;
	private GOval circle;
	private GPoint start;
	private GPoint dragPoint;
	private double radius = CIRCLE_D /2;
	
	public void init() {
		drawCircle();
		pause(2);
	}
	

	private void drawCircle() {
		circle = new GOval(CIRCLE_D, CIRCLE_D);
		circle.setFilled(true);
		add(circle, getWidth() - CIRCLE_D / 2, getHeight() - CIRCLE_D / 2);
	}

	public void run() {
		
		rgen = RandomGenerator.getInstance();
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e) {
		circle.setColor(rgen.nextColor());
	}
	
	public void mousePressed(MouseEvent e) {
		start = new GPoint(e.getPoint());
	}
	
	public void mouseDragged(MouseEvent e) {
		dragPoint = new GPoint(e.getPoint());
		if( getWidth() / 2 - dragPoint.getX() > getWidth() / 2 - start.getX() || getHeight() / 2 - dragPoint.getY() > getHeight() / 2 - start.getY()) {
			radius--;
		}else{
			radius ++;
		}
		start = dragPoint;
		circle.setSize(2* radius, 2* radius);
		circle.setLocation(getWidth() /2 - radius , getHeight() /2 - radius);
	}
}
