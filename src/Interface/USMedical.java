package Interface;

public interface USMedical extends UNHO,WHO {
	
	int min_fee=100;
	
	public void pediaServices();

	public void cardicServices();

	public void pyhsioServices();
	
	public void doctors(int count);
	
	public String getHospInfo();
	
	
	//1. can have the method body with static methods:
	public static void bloodTest() {
		System.out.println("US Medical -- Blood Test");
	}
	
	//2. can have one default method
	public default void billing() {
		System.out.println("US Medical -- billing");
	}
	

}
