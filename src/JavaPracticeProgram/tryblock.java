package JavaPracticeProgram;

public class tryblock {
	
	
	String name="Raj";

	public static void main(String[] args) {
		
		
		tryblock t=new tryblock();
		
		try
		{
			t=null;
           t.name="ty";
           
           int x=9/0;
		}
		
		catch(ArithmeticException e)
		{
		System.out.println("Invalid entry");
			e.printStackTrace();
	}
	
		catch (NullPointerException e) {
		
		System.out.println("null pointer");
	}
		
		finally {
			System.out.println("Remove connection");
		}
		
		System.out.println(marks("Tom"));
		
	}
	
	
	
	public static int marks(String name)
	{
		if(name.equals("Ram"))
		{
			return 90;
		}
		
		else if(name.equals("Tom"))
		{
			try
			{
				int x=9/1;
				return 34;	
			}
			catch (ArithmeticException e) {
				System.out.println("arith");
				return 48;
			}
			
			finally {
				System.out.println("Finally");
				return 100;
			}
		}
		return -1;
	}

}
