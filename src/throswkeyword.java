
public class throswkeyword {
	
	
	public void m1()
	{
		System.out.println("This is m1");
		m2();
	}
	public static void m2() throws ArithmeticException,NullPointerException
	{
		System.out.println("This is m2");
		
		new throswkeyword().m3();
	}
	
	public void m3() throws ArithmeticException,NullPointerException
	{
		System.out.println("this is m3");
		
		int x=9/0;
	}

	public static void main(String[] args) {
		
		
		throswkeyword obj=new throswkeyword();
		try {
		obj.m1();}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled");
		}
		


	}

}
