package Encapsulation;


//With Constructor,default constructor, getters and setters

public class Ebay {

	
	private String UserName;
	private String Password;
	
	
	public Ebay()
	{
		
	}
	
	public Ebay(String UN,String PW)
	{
		UserName=UN;
		Password=PW;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	public void Dologin(String UN, String PW)
	{
	System.out.println("Login with"+" "+UN+" "+PW);
	}
	
	public void Dologout()
	{
		System.out.println("Logout");
	}
}
