package JavaProgramingForInterview;

import java.nio.IntBuffer;
import java.util.Scanner;

public class Palindrome_check {
	
	
	
	public static void pali()
	{ 
         Scanner sc=new Scanner(System.in);
		
	    System.out.println("Please enter the value");
		
	       String user_input = sc.nextLine().toLowerCase(); 
	       
	       
	      StringBuffer bf=new StringBuffer(user_input.toLowerCase());
	      
	        bf.reverse();
	        
	     String data = bf.toString();
	     
	     if(data.equalsIgnoreCase(user_input))
	     {
	    	 System.out.println("Given String is palindrome");
	     }
	     else
	     {
	    	 System.out.println("Given string is not an palindrome");
	     }
		
	}
	
	
	public static void main(String[] args) {
		
		
	//	pali();
		
		
		String str="Madam";
		
	    final String value=str;
		
		char[] conv = str.toCharArray();
		
		String act ="";	
		
		for(int i=(conv.length)-1;i>=0;i--)
		{
			// System.out.print( conv[i]);
			
			 
			 act=act+conv[i];
			 
			// System.out.print(act);
			
		}
		
		if(act.equalsIgnoreCase(value))
		{
			System.out.print("Given value is palindrome"+" "+act);
		}else
		
		System.out.print("Given value is not a palindrome"+" "+act);
		
		
		
		
		
		
	


	      
	       

		
		
	}

}
