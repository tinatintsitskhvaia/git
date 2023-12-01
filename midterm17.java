import acm.program.*;
import acm.util.RandomGenerator;

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.*;
public class midterm17 extends GraphicsProgram{
	private static final int CIRCLE_D = 100;
	private static final int DELAY = 200;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private GObject selectedObject = null;
	public void init() {
		addMouseListeners();
		
	}
	public void run() {
		while(true) {
			if(selectedObject != null) {
				while(selectedObject.getColor() != Color.GREEN){
					Color color= myRandomColor();
					selectedObject.setColor(color);
					pause(DELAY);
				}
				selectedObject= null;
			}
			pause(10);
		}
		
		
	}
	private Color myRandomColor() {
		int randomNum = rgen.nextInt(5);
		if(randomNum == 0){
			return Color.GREEN;
		}
		if(randomNum == 1){
			return Color.RED;
		}
		if(randomNum == 2){
			return Color.BLUE;
		}
		if(randomNum == 3){
			return Color.BLACK;
		}
		
		return Color.YELLOW;
	}
	
	public void mouseClicked(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		 GObject object = getElementAt(x, y);
		 if(object == null) {
			 GOval oval = new GOval(CIRCLE_D, CIRCLE_D);
			 add(oval,x - CIRCLE_D, y- CIRCLE_D);
			 oval.setFilled(true);
			 oval.setColor(myRandomColor());
		 }else{
			 selectedObject = object;
		 }
	}
}
