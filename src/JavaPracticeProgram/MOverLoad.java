package JavaPracticeProgram;

public class MOverLoad {

	public static void main(String[] args) {
		
		MOverLoad obj = new MOverLoad();
		obj.login();
		obj.login("Subrahmanya");

	}
	
	public void login()
	{
		System.out.println("login with web");
	}
	
	public static void login(int num)
	{
		System.out.println("login with web");
	}
	
	public void login(int parent,int num)
	{
		System.out.println("hello");
	}
	void login(String name)
	{
		System.out.println("login with web");
	}

}
