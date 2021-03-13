
public class ConstructrOverload {
	
	
	String Name;
	int CustID;
	boolean Active;
	String Place;
	
	
	public ConstructrOverload(String Name, int CustID, boolean Active, String Place) {
		
		this.Name = Name;
		this.CustID = CustID;
		this.Active = Active;
		this.Place = Place;
	}
	
	public ConstructrOverload(String Name,int CustID)
	{
		this.Name=Name;
		this.CustID=CustID;
	}
	
	public ConstructrOverload()
	{
		
	}


	public static void main(String[] args) {
		ConstructrOverload c2=new ConstructrOverload();
		System.out.println(c2.Active);
		
		ConstructrOverload c=new ConstructrOverload("Subrahmanya", 123, true, "Dharmashala");
		System.out.println(c.Active);
		
	
		

	}

}
