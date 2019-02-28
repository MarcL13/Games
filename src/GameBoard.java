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
	
	setVisible(true);
	setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[])
	{
		new WalkingMan(10,10);
		new GameBoard();
	}
}
