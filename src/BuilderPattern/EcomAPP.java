package BuilderPattern;

public class EcomAPP {
	
	
	public EcomAPP login()
	{
		System.out.println("default login");
		return this;
		
	}
	
	public static void login(String SSO)
	{
		System.out.println("Login with SSO"+SSO);
		
	}
	
	public EcomAPP login(String UN,String PW)
	{
		System.out.println("Login with"+ UN + PW);
		return this;
	}
	
	public EcomAPP dosearch(String ProductName)
	{
		System.out.println("Search with"+ProductName);
		return this;
	}
	
	public EcomAPP dosearch(String ProductName,int price)
	{
		System.out.println("Search with"+ProductName+" "+price);
		return this;
	}
	
	public EcomAPP selectProduct(String productName) {
		System.out.println("select the product : " + productName);
		return this;
		
	}

	public EcomAPP addToCart(String productName) {
		System.out.println("ading the product in cart : " + productName);
		return this;
	}

	public EcomAPP doPayment(String accountName, String pwd) {
		System.out.println("payment done via : " + accountName + " : " + pwd);
		return this;
	}

	public int generateOrderId() {
		return 10002;
	}

	public EcomAPP getEmail() {
		System.out.println("email is sent successfully....");
		return this;

	}

	public EcomAPP logout() {
		System.out.println("logout from app....");
		return this;

}

}