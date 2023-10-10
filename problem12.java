import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class problem12 extends GraphicsProgram{
	public void run() {
		GOval myOval = new GOval(100,200);
		add(myOval, 100,100);
		
		myOval = new GOval(200,200);
		add(myOval, 200,200);
		
		add(myOval);
		myOval.setFilled(true);
		myOval.setColor(Color.RED);
		
		
		
		
	}
}
