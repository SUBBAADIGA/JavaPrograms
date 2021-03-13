package BuilderPattern;

public class EcomUser {

	public static void main(String[] args) {
		
		EcomAPP ap=new EcomAPP();
				ap.login("Subrahmanya", "test@123").dosearch("Smart Phone").addToCart("Smart Phone").doPayment("UPI", "test@123").logout();
				int OI = ap.generateOrderId();
		

	}

}
