import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;
public class Problem14 extends GraphicsProgram {
	public void run() {
		drawFace();
		drawLeftEye();
		drawRightEye();
		drawMouth();
	}

	private void drawMouth() {
		GRect mouth = new GRect(120, 50);
		mouth.setFilled(true);
		mouth.setColor(Color.BLACK);
		int x = (getWidth() - 120) / 2;
		int y = (getHeight() + 50 / 2 - 50) / 2;
		add(mouth, x, y);
		
	}

	private void drawRightEye() {
		GOval eye = new GOval (70, 50);
		eye.setFilled(true);
		eye.setColor(Color.GREEN);
		int x = (getWidth() /2 + 35);
		int y = (getHeight() - 50) / 2 + 100;
		add(eye, x, y);
		
	}

	private void drawLeftEye() {
		GOval eye = new GOval (70, 50);
		eye.setFilled(true);
		eye.setColor(Color.GREEN);
		int x = (getWidth() - 70) / 2 - 70;
		int y = (getHeight() - 50) / 2 + 100;
		add(eye, x, y);
	}

	private void drawFace() {
		GRect face = new GRect(300, 400);
		face.setFilled(true);
		face.setColor(Color.RED);
		int x = (getWidth() - 300) / 2;
		int y = (getHeight() - 400) / 2;
		add(face, x, y);
		
	}

}
