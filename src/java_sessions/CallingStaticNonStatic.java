package java_sessions;

public class CallingStaticNonStatic {
	
	public void launch()
	{
		System.out.println("Launch");
	
		
	}
	
	public static void add()
	{
		System.out.println("add");
		CallingStaticNonStatic c2=new CallingStaticNonStatic();
		c2.launch();
	}
	
	

	public static void main(String[] args) {
		
	
		
		add();
		

	}

}
