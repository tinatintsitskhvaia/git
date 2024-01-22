import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.*;
public class Problem67  extends GraphicsProgram{
	public void init() {
		photos = new JTextField(40);
		add(photos, SOUTH);
		photos.addActionListener(this);
		addActionListeners();
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==photos) {
			try{
			GImage pic = new GImage(photos.getText());
			double x = (getWidth() -pic.getWidth())/2;
			double y =(getHeight() -pic.getHeight())/2;
			add(pic, x,y);
			}catch(Exception ex) {
				GLabel label =new GLabel("erroe, could not find that picture");
				add(label, getWidth()/2, getHeight()/2);
			}
		}
	}
	private JTextField photos;
}
