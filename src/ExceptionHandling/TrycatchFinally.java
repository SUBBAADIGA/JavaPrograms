package ExceptionHandling;

public class TrycatchFinally {
	
	 String name;
	
	public static void main(String[] args)
	{
		
		TrycatchFinally x=new TrycatchFinally();
				
		int base=0;
		
		try
		{
			x=null;
			String sname = x.name;
			System.out.println(sname);
		}
		
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("Hello catch block");
		}
		finally
		{
			System.out.println("This is finally block");
		}
		
		
		
		
	}

}
