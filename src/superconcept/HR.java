package superconcept;

public class HR extends Dept {

	
	@Override
	public void add()
	{
		System.out.println("child class add");
		super.add();
		System.out.println(super.x);
		
	}
	
	public void check()
	{
		super.add();
	}
	
	
	
	
}
