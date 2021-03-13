package Encapsulation;

public class EbayRun {

	public static void main(String[] args) {
		
		Ebay e1=new Ebay();
		
		e1.setUserName("Seller@ebay.com");
		e1.setPassword("test@123");
		
		e1.Dologin(e1.getUserName(), e1.getPassword());
		e1.Dologout();
		
		System.out.println("--------------");
		
		
		Ebay e2=new Ebay("Admin@test.com","test@123");
		
		e2.Dologin(e2.getUserName(), e2.getPassword());
		e2.Dologout();
		
		
			
				
		
		
	}

}
