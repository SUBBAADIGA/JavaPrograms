package ExceptionHandling;

public class Trycatch {
	
	
	public static int GetMasrks(String Name)
	{
		if(Name.equals("SONAM"))
		{
			return 90;
		}
		else if (Name.equals("RAJ"))
		{
			try
			{
				int i=9/0;
				return 45;
			}
		
			catch(Exception e)
			{
				System.out.println("Hello");
				return 56;
			}
			finally
			{
				System.out.println("This is finally block");
			
				return 10;
			}
			
		}
		return 0;
	}
	
	

	public static void main(String[] args) {
		int ch = GetMasrks("RAJ");
		System.out.println(ch);
	
		
}
}
