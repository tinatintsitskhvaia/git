import acm.program.*;

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.*;

public class midterm8 extends GraphicsProgram {
	private static final int BOX_SIZE = 100;
	private GLabel label;
	private int x1;
	private int x2;
	private GRect box;
	private int point;

	public void init() {
		drawBox();
	}

	private void drawBox() {
		box = new GRect(BOX_SIZE, BOX_SIZE);
		box.setFillColor(Color.WHITE);
		add(box, (getWidth() - BOX_SIZE) / 2, (getHeight() - BOX_SIZE) / 2);
		point = 0;
		label = new GLabel("" + point);
		add(label, (getWidth() - label.getWidth()) / 2, (getHeight() + label.getAscent()) / 2);

	}

	public void run() {
		addMouseListeners();
	}

	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if (getElementAt(x, y) == box) {
			x1 = x;
		}

	}

	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if (getElementAt(x, y) == box) {
			x2 = x;

		}
	}

	public void mouseReleased(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if (getElementAt(x, y) == box) {
			if (x1 > x2 && point != 0) {
				point--;
				label.setLabel("" + point);
			}
			if (x1 < x2 && point != 9) {
				point++;
				label.setLabel("" + point);

			}
		}
	}

}
