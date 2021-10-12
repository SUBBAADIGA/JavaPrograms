package JavaPracticeProgram;

public class trowsconcept {
	
	
	public void test1()
	{
		System.out.println("hello");
	}

	public int devide(int y) throws ArithmeticException
	{
		int x=100/y;
		
		return x;
	}
	
	public  void result(int num)
	{
		try {
		int result = devide(num);
		System.out.println(result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Enterd value cant be processed");
			e.printStackTrace();
		}
		
		finally {
			System.out.println("finally");
		}
	}
	public static void main(String[] args) {
		
		trowsconcept c=new trowsconcept();
		c.result(0);

	}

}
