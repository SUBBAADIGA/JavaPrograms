package java_sessions;

public class MetodswithNoReturnType {
	int sachin=1000;
	int sehwag=230;
	
	void getScore()
	{
		int x=sachin+sehwag;
		System.out.println(x);
	}
	
	
	
	String GetName()
	{
		System.out.println("Getting the Names of the Players");
		if(sachin>=sehwag)
		{
			return "Sachin is Greater";
		}
		else
		{
		return "Sehwag is greater";
		}
		
		
	}

	public static void main(String[] args) {
		
		MetodswithNoReturnType obj=new MetodswithNoReturnType();
		
		obj.getScore();
		int sachinScore = obj.sachin;
		int SehwagScore = obj.sehwag;
		System.out.println(sachinScore);
		System.out.println(SehwagScore);
	
	System.out.println(obj.GetName());
		

	}

}
