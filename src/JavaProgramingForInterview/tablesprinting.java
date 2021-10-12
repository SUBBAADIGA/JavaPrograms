package JavaProgramingForInterview;

import java.util.Scanner;

public class tablesprinting {

	public static void main(String[] args)  {
	
		Scanner sc=new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number>=2 && number<=20)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(number+" "+"*"+" "+i+" "+"="+number*i);
			}
		}
	}

}
