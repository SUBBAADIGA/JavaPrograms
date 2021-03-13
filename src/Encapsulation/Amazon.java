package Encapsulation;
// with Getters and setters

public class Amazon {

private String UserName;
private String Password;

public void SetUserName(String UserName)
{
	this.UserName=UserName;
}

public void SetPassword(String Password)
{
	this.Password=Password;
}
	
public String GetuserName()
{
	return UserName;
	
}
public String GetPassword()
{
	return Password;
	
}

public void dolOgin(String UN,String PW)
{
	System.out.println("Login with "+UN+" "+PW);
}
public void logout()
{
	System.out.println("logout");
}
	

}
