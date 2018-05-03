import java.util.*;
public class LawnMowerSimulator 
{
	private LinkedList<LawnMap> lawnList;
	
	
	public LawnMowerSimulator( LinkedList<LawnMap> lList )
	{
		lawnList = lList;
	}
	
	
	public LinkedList<LawnMap> getLawnList()
	{
		return lawnList;
	}
}
