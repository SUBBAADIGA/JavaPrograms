package DataConversion;

public class StrintoInt {

	public static void main(String[] args) {

		
		String val="SR6745";
		
		String[] num = val.split("SR");
		
	   String fin = num[1];
	   
	   int x = Integer.parseInt(fin);
	   System.out.println(x);
	}

}
