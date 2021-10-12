package JavaPracticeProgram;

public class mc {
	
	
	public void m1()
	{
		System.out.println("m1");
	}
	
	public static void m2()
	{
		System.out.println("m2");
		mc m=new mc();
		m.m3();
	}
	
	public void m3()
	{
		System.out.println("m3");
		m1();
	}

	public static void main(String[] args) {
		
		m2();

	}

}
