package Inheritence;

public class Run_state {

	public static void main(String[] args) {
	
		Karnataka k1=new Karnataka("Army");
		
		System.out.println(k1.Capital);
		k1.Police();
		String DefenceByIndianGov=k1.GetDefence();
		System.out.println(DefenceByIndianGov);
		
		
	}

}
