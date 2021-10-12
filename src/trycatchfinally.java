
public class trycatchfinally {

	public static void main(String[] args) {
		
		
		try {
			int x=9/0;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("There is arithmatic exception");
			e.printStackTrace();
		}

		
		finally
		{
			System.out.println("Disconnected from server");
		}
		
		try
		{
			int y=10/0;
		}
		
		finally
		{
			System.out.println("hhf");
		}
	}

}
