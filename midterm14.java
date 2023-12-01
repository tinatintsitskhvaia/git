import acm.graphics.*;
import acm.program.*;
import java.awt.event.MouseEvent;
public class midterm14 extends GraphicsProgram{
	private int x;
	private int y;
	private GLine line;
	
	public void init() {
		x = y= 0;
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		line = new GLine(x, y, e.getX(), e.getY());
		add(line);
	}
	
	public void mouseDragged(MouseEvent e) {
		line.setEndPoint(e.getX(), e.getY());
		
	}
	public void mouseReleased(MouseEvent e) {
		x= e.getX();
		y= e.getY();
	}
}

