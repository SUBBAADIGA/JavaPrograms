package Inheritence;

public class Karnataka extends India {
	
	
	public Karnataka(String Defence) {
		super(Defence);
		
	}

	@Override
	public void Police() {
		
		super.Police();
		System.out.println(super.Capital);
		
		System.out.println("Karnataka Police");
	
	}
	
	
	

}
