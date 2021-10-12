package Final_Interview;

public class ReverseStringNormal {

	public static void main(String[] args) {
		
		
		String str="helloWorld";
		
	System.out.println(str.length());
		
		char[] ch = str.toLowerCase().toCharArray();
		
		String fin="";
		
		for(int i=(str.length())-1;i>=0;i--)
		{
			fin=fin+ch[i];
			
			//fin=fin+(str.charAt(i));
			
			
		//System.out.println(str.charAt(i));
		}
		System.out.println(fin);
		
		

	}

}
