
public class throwskeyword2 {
	
	
	public void m1() throws ArithmeticException
	{
		System.out.println("m1");
		m2();
	}
	
	public void m2() throws ArithmeticException
	{
		System.out.println("m2");
		m3();
	}
	
	public static void m3() throws ArithmeticException
	{
		System.out.println("m3");
		throwskeyword2 er=new throwskeyword2();
		er.m4();
	}
	
	public void m4() throws ArithmeticException
	{
		int x=6/0;
		System.out.println("m4");
	}

	public static void main(String[] args)  {
	
		throwskeyword2 er=new throwskeyword2();
		er.m1();
	}

}
