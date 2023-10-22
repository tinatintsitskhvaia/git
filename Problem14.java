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
		GRect mouth = new GRect(100, 40);
		mouth.setFilled(true);
		mouth.setColor(Color.BLACK);
		int x = (getWidth() - 100) / 2;
		int y = (getHeight() + 40 / 2 - 40) / 2;
		add(mouth, x, y);
		
	}

	private void drawRightEye() {
		GOval eye = new GOval (60, 40);
		eye.setFilled(true);
		eye.setColor(Color.GREEN);
		int x = (getWidth() /2 + 30);
		int y = (getHeight() - 40) / 2 + 80;
		add(eye, x, y);
		
	}

	private void drawLeftEye() {
		GOval eye = new GOval (60, 40);
		eye.setFilled(true);
		eye.setColor(Color.GREEN);
		int x = (getWidth() - 60) / 2 - 60;
		int y = (getHeight() - 40) / 2 + 80;
		add(eye, x, y);
	}

	private void drawFace() {
		GRect face = new GRect(200, 300);
		face.setFilled(true);
		face.setColor(Color.RED);
		int x = (getWidth() - 200) / 2;
		int y = (getHeight() - 300) / 2;
		add(face, x, y);
		
	}

}
