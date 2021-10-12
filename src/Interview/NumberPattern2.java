package Interview;

public class NumberPattern2 {

	public static void main(String[] args) {
		/* j
		 i 1 2 3 4  
           5 6 7  
           8 9  
		   10  
		 */
		
		int count=1;
		for(int i=3;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println(" ");
		}

	}

}
