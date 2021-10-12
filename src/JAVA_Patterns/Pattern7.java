package JAVA_Patterns;

public class Pattern7 {

	public static void main(String[] args) {
		
		
		/*
		      * * * * 
               * * * 
                * * 
                 * 	 
		 */

		
		for(int i=0;i<=3;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=3;j>=i;j--)
			{
				System.out.print("*"+" ");
			}
			System.out.println("");
		}
	}
	}


