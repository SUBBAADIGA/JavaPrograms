package Interview;

public class NumberPattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	  j
	    i * * * * 
		    * * *
		      * *
		        *
*/
		
		for(int i=0;i<=3;i++)
		{
			for(int k=0;k<i;k++)
			{
				System.out.print(" "+" ");
			}
			
		    for(int j=3;j>=i;j--)
		    {
		    	System.out.print("*"+" ");
		    }
		    System.out.println(" ");
		}

	}

}
