package Interface;

public class TestHospital {

	public static void main(String[] args) {
	
		
		FortisHospital fh=new FortisHospital();
		fh.billing();
		
		fh.cardicServices();
		fh.covid19Test();
		String HInfo=fh.getHospInfo();
		System.out.println(HInfo);
		System.out.println(USMedical.min_fee);
		USMedical.bloodTest();
		
		IndianMedical ind = new FortisHospital();
		
		ind.neuroServices();
		ind.covid19Test();
		ind.oncology();
		

	}

}
