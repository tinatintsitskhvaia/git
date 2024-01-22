import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.graphics.*;
import acm.program.*;

public class Problem68 extends GraphicsProgram {
	public void run() {

	}

	public void init() {
		field = new JTextField(20);
		add(field, SOUTH);
		field.addActionListener(this);

		JButton enter = new JButton("enter");
		add(enter, SOUTH);
		addActionListeners();
	}
	
	public void actionPerformed (ActionEvent e){
		if(e.getSource() == field || e.getSource() == ("enter")){
			String text = field.getText();
			if(text != null || !text.equals("")) {
				GLabel label = new GLabel(text);
				add(label, x,y);
				y +=y;
			}
			
		}
	}

	private JTextField field;
	private double x= 50;
	private double y = 50;
}
