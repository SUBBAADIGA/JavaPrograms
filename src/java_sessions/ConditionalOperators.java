package java_sessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		
		
	
		if(true) //Here if will consider bool value if true then execute
		{
			System.out.println("Print Hello");
		}
		if(false) //this is dead code as if will not consider false
		{
			System.out.println("dead code");
		}

		
		//String Comparision.
		
		String s1="Hello";
		String s2="hello";
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Hello Both are same");
		}
		
		if(s1.equals(s2))
		{
			System.out.println("Hello both are absolutly same");
		}
		
		
		
		//switch cases
		
		String Bank="Axis Bank";
		
		switch (Bank) {
		
		case "Axis Bank":
			
				System.out.println("Hello Axis bank");
			
		case "ICICI bank":
			System.out.println("Only for Corporate people");
			
		case "CANARA BANK":
			System.out.println("Only for Rural ");

		default:
			System.out.println("General Bank is not allowed");
			
		}
	}
	

	
}
