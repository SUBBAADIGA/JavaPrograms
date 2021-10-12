package Interview;

public class page {
	
	public static void t1()
	{
		System.out.println("hello t1");
	
	}
	
	public static void t2()
	{
		System.out.println("hello t2");
		t1();
	}
	
	public void add()
	{
		t1();
		System.out.println("hello add");
	}
	
	public static void t3()
	{
		System.out.println("hello t3");
		page p1=new page();
		p1.add();
	}
	
	


	public static void main(String[] args) {
		
	
		t3();
		

	}

}
