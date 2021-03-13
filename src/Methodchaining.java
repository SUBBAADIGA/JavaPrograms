
public class Methodchaining {
	
	public void launch()
	{
		System.out.println("Launch");
		header();
		t1();
	}
	
	public void header()
	{
		System.out.println("header");
		title();
	}
	
	public void title()
	{
		System.out.println("title");
		close();
	}
	
	public void close()
	{
		System.out.println("close");
		
	}
	
	
	public static void t1()
	{
		System.out.println("Hello t1");
		t2();
	}
	
	public static void t2()
	{
		System.out.println("Hello t2");
		t3();
		Methodchaining mw=new Methodchaining();
		mw.header();
	}
	
	public static void t3()
	{
		System.out.println("Hello t3");
	}
	
	
	

	public static void main(String[] args) {
		
		
		Methodchaining m=new Methodchaining();
				m.launch();

				t1();
	}

}
