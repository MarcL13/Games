import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class WalkingMan extends JComponent
{
	
	private Ellipse2D.Double head;
	private Rectangle leftArm, rightArm, leftLeg, rightLeg, body;
	
	public WalkingMan(int x, int y)
	{
		this.setLocation(x,y);
		this.setSize(31,56);
		
		head = new Ellipse2D.Double(10, 0, 10, 10);
		leftArm = new Rectangle(0, 10, 10, 7);
		rightArm = new Rectangle(20,10,10,7);
		body = new Rectangle(10,10,10,30);
		leftLeg = new Rectangle(2,35,8,15);
		rightLeg = new Rectangle(20,35,8,15);
	}
	
	
		public void paintComponent(Graphics g)
		{
			Graphics2D g2 = (Graphics2D) g;
			
			g2.fill(head);
			g2.fill(leftArm);
			g2.fill(rightArm);
			g2.fill(body);
			g2.fill(leftLeg);
			g2.fill(rightLeg);
		}
		
		
	




	

}
