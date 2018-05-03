import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MowerGame implements KeyListener
{
	private LawnMowerSimulator game;
	private int level;
	private LawnMap current;
	private char[][] map;
	private int score;
	private int x,y;
	
	public MowerGame (LawnMowerSimulator g )
	{
		game = g;
		level = 0;
		initialize(level);
	}
	
	private void initialize(int l )
	{
		current = game.getLawnList().get(level);
		map = current.getLawn();
		x = current.getStartX();
		y = current.getStartY();
		// graphics beginning
	}
	
	private void move(int v, int h )
	{
		
	}

	public void keyPressed(KeyEvent arg0) {
		if (arg0.getKeyCode() == KeyEvent.VK_DOWN )
		{
			move(-1,0);
		}
		else if (arg0.getKeyCode() == KeyEvent.VK_UP )
		{
			move(1,0);
		}
		else if (arg0.getKeyCode() == KeyEvent.VK_RIGHT )
		{
			move(0,1);
		}
		else if (arg0.getKeyCode() == KeyEvent.VK_LEFT )
		{
			move(0,-1);
		}
		
	}
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
