package JAVA_Patterns;

public class Pattern2 {

	public static void main(String[] args) {
		/* j
		 i  * * * *  
            * * *  
            * *  
		    *  

		 */
		
		for(int i=4;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println(" ");
		}
		

	}

}
