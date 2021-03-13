package Inheritence;

public class India {
	private String Defence;
	String Capital="Delhi";
	
	public India(String Defence)
	{
		this.Defence=Defence;
	}
	

	public void Parliment()
	{
		System.out.println("Indian Parliment");
	}
	
	public void Police()
	{
		System.out.println("Indian Police");
	}
	
	public String GetDefence()
	{
		return Defence;
	}
	
	
	

}
