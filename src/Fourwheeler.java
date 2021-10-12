
public class Fourwheeler {
	
private int wheelcount;
private String type;

	public Fourwheeler(int wheelcount,String type)
	{
		this.wheelcount=wheelcount;
		this.type=type;
	}
	
	public void GeneralDetails()
	{
		System.out.println("This is general details about car");
	}
	
	public void CarGenDetails()
	{
		System.out.println("This is Car details"+wheelcount+type);
	}
	
	

}
