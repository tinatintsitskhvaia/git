import acm.program.*;

import java.awt.Color;

import acm.graphics.*;
public class midterm8 extends GraphicsProgram {
	private static final int BOX_SIZE = 100;
	private GRect box;
	private GLabel label;
		
	public void init() {
		drawBox();
	}
	private void drawBox() {
		box = new GRect(BOX_SIZE, BOX_SIZE);
		box.setFillColor(Color.WHITE);
		add(box, (getWidth() - BOX_SIZE )/2 ,(getHeight() - BOX_SIZE) /2);
		label = new GLabel("0");
		add(label,(getWidth()- label.getWidth()) /2, (getHeight() + label.getAscent())/2);
		
	}
	public void run() {
		
	}

}
