package JavaProgramingForInterview;

import java.util.Scanner;

public class PaliInt {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter the number");
		
		String num = sc.nextLine();
		 
		int actnum = Integer.parseInt(num);
		
		final int act=actnum;
		System.out.println(actnum);
		
		int reverse=0;
		
		while(actnum!=0)
		{
			int remainder=actnum%10;
			
			reverse=reverse*10+remainder;
			
			actnum=actnum/10;
		}
		
		System.out.println(reverse);
		if(reverse==act)
		{
			System.out.println("Given Number is palindrome");
		}
		else
		{
			System.out.println("Given Number is not an palindrome");
		}
				
				
	
		
	}

}
