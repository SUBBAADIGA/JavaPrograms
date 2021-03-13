package Encapsulation;

public class AmazonRun {

	public static void main(String[] args) {
		
		
		Amazon a=new Amazon();
		a.SetUserName("subbaadiga");
		a.SetPassword("test@123");
		
		
		a.dolOgin(a.GetuserName(), a.GetPassword());
		
		
		a.logout();
		
		

	}

}
