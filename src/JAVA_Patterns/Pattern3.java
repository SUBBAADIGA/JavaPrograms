package JAVA_Patterns;

public class Pattern3 {

	public static void main(String[] args) {
		
	/*	j
	  i *
		* *
		* * *
		* * * *
		* * *  
        * * 
        *  
		
		*/
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println("");
		}
		
		for(int i=2;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println("");
		}

	}

}
