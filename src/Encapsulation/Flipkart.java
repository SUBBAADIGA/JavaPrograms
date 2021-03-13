package Encapsulation;

//with Constructor and gettesrs

public class Flipkart {
	
	private String UserName;
	
	private String Password;
	
	public Flipkart(String UN,String PW)
	{
		UserName=UN;
		Password=PW;
	}
	
	public String GetUserName()
	{
		return UserName;
	}
	
	public String GetPassword()
	{
		return Password;
	}

	public void DoLogin(String UN, String PW)
	{
		System.out.println("Login with"+UN+" "+PW);
	}
	
	public void DoLogout()
	{
		System.out.println("Logout");
	}
	
	
}
