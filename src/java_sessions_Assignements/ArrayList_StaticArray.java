package java_sessions_Assignements;

public class ArrayList_StaticArray {
	
	
	public String[] GetCricketPlayerData(String Name)
	{
		String cdata[]=new String[3];
		
		switch (Name.toLowerCase()) {
		case "sachin":
			cdata[0]="RHB";
			cdata[1]="INDIA";
			cdata[2]="Opener";
			
			break;
			
		case "sehwag":
			cdata[0]="RHB";
			cdata[1]="INDIA";
			cdata[2]="Opener";
			
			break;
			
		case "virat kohli":
			cdata[0]="RHB";
			cdata[1]="INDIA";
			cdata[2]="One Down";
			
			break;
			
		case "abd":
			cdata[0]="RHB";
			cdata[1]="SA";
			cdata[2]="two Down";
			
			break;

		default:
			System.out.println(Name+" "+"Data Not available");
			break;
		}
		return cdata;
	}

	public static void main(String[] args) {
		
		
   ArrayList_StaticArray obj=new ArrayList_StaticArray();
   
 String[] data = obj.GetCricketPlayerData("Abd");
 
 for(String e:data)
 {
	 System.out.println(e);
 }

		
		
		
		
		

	}

}
