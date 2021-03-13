package Encapsulation;

public class FlipkartRun {

	public static void main(String[] args) {
		
		
		Flipkart f=new Flipkart("subbaadiga", "test@123");
		
		f.DoLogin(f.GetUserName(),f.GetPassword());
		
		f.DoLogout();
	}

}
