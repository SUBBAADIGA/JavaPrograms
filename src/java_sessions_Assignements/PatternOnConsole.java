package java_sessions_Assignements;

public class PatternOnConsole {

	public static void main(String[] args) {
		
		for(int i=4;i>=0;i--)
		{
			System.out.println("n="+i);
		}
		
		int count=00;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=9;j++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
			
		}
		
		
		for(int x=0; x<=9; x++)
		{
			for(int y=0; y<=9; y++)
			{
				System.out.print(x+""+y+" ");
			}
			System.out.println();
		}
	
	}

}
