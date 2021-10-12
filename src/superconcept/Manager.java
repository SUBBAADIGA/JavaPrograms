package superconcept;

public class Manager extends HR{
	
	@Override
	public void add()
	{
		System.out.println("manager class add");
	}
	
	public void val()
	{
		super.add();
		super.check();
	}
	
	

}
