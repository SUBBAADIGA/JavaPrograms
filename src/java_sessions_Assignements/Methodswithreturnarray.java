package java_sessions_Assignements;

public class Methodswithreturnarray {
	
	
	public String[] getGadetsDetails()
	{
		String gad[]=new String[2];
		gad[0]="Phone";
		gad[1]="TV";
		return gad;
	}

	public static void main(String[] args) {
		
		Methodswithreturnarray arr=new Methodswithreturnarray();
		String[] d = arr.getGadetsDetails();
		for(String e:d)
		{
			System.out.println(e);
		}
		

	}

}
