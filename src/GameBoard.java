import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class GameBoard extends JFrame
{
	public GameBoard()
	{
	setTitle("Walking Man");
	setBounds(400,500,500,500);
	setLayout(null);
	
	WalkingMan man = new WalkingMan(10,10);
	add(man);
	
	addKeyListener(new KeyListener()
	{

		public void keyPressed(KeyEvent e)
		{
			if(e.getKeyCode() == KeyEvent.VK_RIGHT)
			{
				man.setLocation(man.getX() + 5, man.getY());
			}
			
			if(e.getKeyCode() == KeyEvent.VK_LEFT)
			{
				man.setLocation(man.getX() - 5, man.getY());
			}
			
			if(e.getKeyCode() == KeyEvent.VK_UP)
			{
				man.setLocation(man.getX(), man.getY() - 5);
			}
			
			if(e.getKeyCode() == KeyEvent.VK_DOWN)
			{
				man.setLocation(man.getX(), man.getY() + 5);
			}
		}

		
		public void keyReleased(KeyEvent e)
		{
			
		}

		
		public void keyTyped(KeyEvent e)
		{
			
		}
		
	});
	
	setVisible(true);
	setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[])
	{
		new WalkingMan(10,10);
		new GameBoard();
	}
}
