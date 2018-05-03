//Michael's attempts to learn how to code
public class test {
	
	public static void main(String[] args) 
	{
		String[][] lawn = new String[5][5];
		for( int i = 0;i<lawn.length;i++)
		{
			for (int j = 0; j < lawn[0].length; j++) 
			{
				lawn[i][j] = "M";
			}
		}
		for( int i = 0;i<lawn.length;i++)
		{
			for (int j = 0; j < lawn[0].length; j++) 
			{
				System.out.print(lawn[i][j] + " ");
			}
			System.out.println();
		}
	}
}
