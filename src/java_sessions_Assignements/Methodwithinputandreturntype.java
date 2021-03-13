package java_sessions_Assignements;

public class Methodwithinputandreturntype {
	
	
	public String fullName(String a, String b)
	{
		String Fullname=a+b;
		return Fullname;
		
	}

	public static void main(String[] args) {
		
		Methodwithinputandreturntype m=new Methodwithinputandreturntype();
	String FullnameofEmployee=m.fullName("Subrahmanya", "Adiga");
	System.out.println(FullnameofEmployee);
		
	}

}
