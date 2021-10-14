package HackerEarth;

public class StringReverse1 {

	public static void main(String[] args) {
		
		String str="Hello World";
	//Want to check palindrome or not?	
		final String copy=str;
		
		char[] lett = str.toCharArray();
		
		String empty="";
		
		String empty2="";
		
		for(int i=(str.length()-1);i>=0;i--)
		{
			empty=empty+str.charAt(i);
			empty2=empty2+lett[i];
		}
		
		System.out.println(empty);
		
		System.out.println(empty2);
		
		

	}

}
