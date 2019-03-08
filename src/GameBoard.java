import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.Timer;

public class GameBoard extends JFrame implements Updatable,ActionListener
{
	private WalkingMan man;
	private ArrayList balls;
	
	public GameBoard()
	{
	setTitle("Walking Man");
	setBounds(400,500,500,500);
	setLayout(null);
	
	man = new WalkingMan(10,10);
	add(man);
	
	balls = new ArrayList<Ball>();
	
	addKeyListener(new KeyListener()
	{

		public void keyPressed(KeyEvent e)
		{
			if(e.getKeyCode() == KeyEvent.VK_RIGHT)
			{
				man.setDx(3);
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_LEFT)
			{
				man.setDx(-3);
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_UP)
			{
				man.setDy(-3);
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_DOWN)
			{
				man.setDy(3);
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_SPACE)
			{
				Ball newBall = new Ball(man.getX(), man.getY());
				balls.add(newBall);
				add(newBall);
				
				for(int i = balls.size(); i > 0; i--)
				{
					
				}
			}

		}

		
		public void keyReleased(KeyEvent e)
		{
			if(e.getKeyCode() == KeyEvent.VK_RIGHT)
			{
				man.setDx(0);
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_LEFT)
			{
				man.setDx(0);
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_UP)
			{
				man.setDy(0);
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_DOWN)
			{
				man.setDy(0);
			}
		}

		
		public void keyTyped(KeyEvent e)
		{
			
		}
		
	});
	Timer t1 = new Timer(1000/60, this);
	t1.start();
	
	setVisible(true);
	setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		man.update();
		repaint();
	}
	
	public static void main(String args[])
	{
		new WalkingMan(10,10);
		new GameBoard();
	}

	@Override
	public void update()
	{
		
	}



	
}
