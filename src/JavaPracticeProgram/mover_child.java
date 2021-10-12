package JavaPracticeProgram;

public class mover_child extends mover_parent {
	
	
	public void start(int x)
	{
		System.out.println("Advanced Start");
	}
	
	@Override
	public void start()
	{
		System.out.println("Advanced overridden start");
	}
	
	public void abs()
	{
		System.out.println("ABS System");
	}
	
	
	//This method is not overridden as in the parent class the method is private.
	public void pm()
	{
		System.out.println("parent private");
	}

}
