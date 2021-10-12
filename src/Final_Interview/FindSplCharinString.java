package Final_Interview;

public class FindSplCharinString {

	public static void main(String[] args) {
		
		
		String str="Sgfj-^3&+$^* ";
		
	System.out.println(str.replaceAll("[^a-zA-Z]", ""));  //Will remain only a-z and A-Z rest will be removed. ^ in the begining us used to keep mentioned one
	
	
	System.out.println(str.replaceAll("[a-zA-Z]", ""));	//will replace a-z A-Z with "" empty 
	

	}

}
