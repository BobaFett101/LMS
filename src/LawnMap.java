
public class LawnMap 
{
	
	private char[][] lawn;
	private int numGrass;		//there should be no grass on start pos
	private int numRocks;
	private int startX;
	private int startY;
	private int endX;
	private int endY;
	
	public LawnMap()
	{
		lawn = new char[3][3];
		startX = 0;
		startY = 0;
		endX = 2;
		endY = 2;
		numGrass = 8;
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				if (i != 0 || j != 0)
				{
					lawn[i][j] = 'G';
				}
			}
		}
	}
	
	public LawnMap( char[][] l, int sX, int sY, int eX, int eY, int nGrass, int nRocks )
	{
		lawn = l;
		startX = sX;
		startY = sY;
		endX = eX;
		endY = eY;
		numGrass = nGrass;
		numRocks = nGrass;
	}
	
	public LawnMap( LawnMap other )
	{
		lawn = other.lawn.clone();
		startX = other.startX;
		startY = other.startY;
		endX = other.endX;
		endY = other.endY;
		numRocks = other.numRocks;
		numGrass = other.numGrass;
	}
	
	public char[][] getLawn()
	{
		return lawn.clone();
	}
	
	public int getStartX()
	{
		return startX;
	}
	
	public int getStartY()
	{
		return startY;
	}
	
	public int getEndX()
	{
		return endX;
	}
	
	public int getEndY()
	{
		return endY;
	}
	
	public int getNumGrass()
	{
		return numGrass;
	}
	
	public int getNumRocks()
	{
		return numRocks;
	}

}
