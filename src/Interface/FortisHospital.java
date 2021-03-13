package Interface;

public class FortisHospital extends Central_Hospital implements USMedical,IndianMedical,UKMedical {

	@Override
	public void pediaServices() {
		System.out.println("FH-----pediaServices");
		
	}

	@Override
	public void cardicServices() {
		System.out.println("FH-----cardicServices");
	}

	@Override
	public void pyhsioServices() {
	
		System.out.println("FH-----pyhsioServices");
		
	}

	@Override
	public void doctors(int count) {
	
		System.out.println("FH-----doctors"+ count);
		
	}

	@Override
	public String getHospInfo() {
		
		return "US Hospital -- FH";
	}
	
	//Indian

	@Override
	public void oncology() {
		System.out.println("FH-----oncology");
		
	}

	@Override
	public void orthoServices() {
		System.out.println("FH-----orthoServices");
		
	}

	@Override
	public void opthoServices() {
		System.out.println("FH-----opthoServices");
		
	}

	
	//UK Medical
	@Override
	public void neuroServices() {
		System.out.println("FH-----neuroServices");
		
	}

	@Override
	public void entServices() {
		
		System.out.println("FH-----entServices");

		
	}

	@Override
	public void gynecServices() {
		System.out.println("FH-----gynecServices");
		
	}
	
	//WHo

	@Override
	public void healthFund() {
		System.out.println("FH-----healthFund");
		
	}

	@Override
	public void covid19Test() {
		System.out.println("FH-----covid19Test");
		
	}

}
